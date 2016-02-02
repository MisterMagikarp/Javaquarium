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
		
		// on r�cup�re le formulaire qui a comme donn�e des PoissonVO
		PoissonVO p = (PoissonVO) form;
		
		final PoissonDO poissonDO = new PoissonDO();
		
		// on r�cup�re les donn�es inscrites dans le formulaire, qu'on va envoyer au bean DO (le bean bdd)
		poissonDO.setNom(p.getNom());
		poissonDO.setCode(p.getCode());
		poissonDO.setCouleur(p.getCouleur());
		poissonDO.setDescription(p.getDescription());
		poissonDO.setPrix(p.getPrix());
		// on r�cup�re le champ de dimension qui est sp�cial car il est s�par� en deux champs dans le DO
		String[] d = p.getDimension().split("x");
		poissonDO.setLongueur (Float.parseFloat(d[0]));
		poissonDO.setLargeur (Float.parseFloat(d[1]));
		
		//on va ins�rer tout �a dans la base de donn�e
		poissonDAO.insert(poissonDO);
		
		
		return mapping.findForward(FW_SUCCESS);
	
	}

}
