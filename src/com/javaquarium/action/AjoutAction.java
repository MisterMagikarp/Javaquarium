package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.IPoissonDAO;
import com.javaquarium.dao.PoissonDAO;

public class AjoutAction extends Action {
	
	private static final String FW_SUCCESS = "success";
	
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {
				
		IPoissonDAO poissonDAO = new PoissonDAO();
		
		// on récupére le formulaire qui a comme donnée des PoissonVO
		PoissonVO p = (PoissonVO) form;
		
		final PoissonDO poissonDO = new PoissonDO();
		
		// on récupére les données inscrites dans le formulaire, qu'on va envoyer au bean DO (le bean bdd)
		poissonDO.setNom(p.getNom());
		poissonDO.setCode(p.getCode());
		poissonDO.setCouleur(p.getCouleur());
		poissonDO.setDescription(p.getDescription());
		poissonDO.setPrix(p.getPrix());
		// on récupére le champ de dimension qui est spécial car il est séparé en deux champs dans le DO
		String[] d = p.getDimension().split("x");
		poissonDO.setLongueur (Float.parseFloat(d[0]));
		poissonDO.setLargeur (Float.parseFloat(d[1]));
		
		//on va insérer tout ça dans la base de donnée
		poissonDAO.insert(poissonDO);
		
		
		return mapping.findForward(FW_SUCCESS);
	
	}

}
