package com.javaquarium.beans.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginVO extends ActionForm {
	
	private String utilisateur;
	private String motDePasse;
	
	/**
	 * @return the utilisateur
	 */
	public String getUtilisateur() {
		return utilisateur;
	}
	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}
	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}
	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public LoginVO(){}
	
	public LoginVO(String utilisateur, String motDePasse){
		this.utilisateur = utilisateur;
		this.motDePasse = motDePasse;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		
final ActionErrors errors = new ActionErrors();
		
		if(StringUtils.isEmpty(getUtilisateur())){
			errors.add("utilisateur", new ActionMessage("login.erreur.utilisateur", "utilisateur"));
		}
		
		if(StringUtils.isEmpty(getMotDePasse())){
			errors.add("password1", new ActionMessage("login.erreur.motdepassevide", "mot de passe"));

		}
		
		if(StringUtils.length(getMotDePasse()) < 4){
			errors.add("password2", new ActionMessage("login.erreur.motdepassecourt", "mot de passe"));
		}
		
		
		request.getSession().setAttribute("utilisateur", this); // va récupéré le nom de l'utilisateur inscrit dans le formulaire
		
		return errors;
	}
	

}
