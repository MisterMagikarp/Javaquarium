package com.javaquarium.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;

public class ListerEspeceAction extends Action {
	
	private static final String FW_SUCCESS = "success";
	public static final String SESSION_REQUEST = "requestTableauPoisson";
	
	public ActionForward execute (final ActionMapping mapping, final ActionForm form, final HttpServletRequest req, final HttpServletResponse res){
		
		// Appelle de l'interface qui va instancier PoissonService()
		IPoissonService service = new PoissonService();
		
		// On va créer une Liste de poisson grâce à la fonction createListPoisson de notre interface
		List<PoissonVO> poissonVO = service.createListPoissons();
		
		// Le tableau créé dans la jsp UC01_especes a comme nom "requestTableauPoisson", on va lui faire passer la liste des poissonVO, comme c'est un tableau créé grâce à un bean on pourra accéder aux propriétés (especes, description, etc...)
		req.getSession().setAttribute(SESSION_REQUEST, poissonVO);
		
		
		return mapping.findForward(FW_SUCCESS);
		
		
	}

}
