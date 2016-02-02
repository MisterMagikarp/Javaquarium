package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.PoissonDAO;

public class PoissonService implements IPoissonService {
	
	@Override
	public List<PoissonVO> createListPoissons(){
		
		//Liste qui va contenir des poissons de type VO (web)
		final List<PoissonVO> listePoisson = new ArrayList<PoissonVO>();
		
		/*// On cr�er un nouveau poisson gr�ce au bean
		final PoissonVO poisson = new PoissonVO("Nemo", "", "Orange", "20.0*15.0","15");
		//On va ajouter ce poisson r�cemment cr�� dans la liste
		listePoisson.add(poisson);*/
		
		//Cr�ation d'un poissonDAO qui fera le lien avec la bdd
		final PoissonDAO poissonDAO = new PoissonDAO();
		
		//Cr�ation d'une liste de PoissonDO (le bean de type bdd), on va faire la liste des �l�ment de la base de donn�es
		final List<PoissonDO> poissonDO = poissonDAO.list();
		
		for (PoissonDO p : poissonDO){
			//instanciation du bean (le bean de type web)
			final PoissonVO poissonVO = new PoissonVO();
			
			//On va r�cup�r� les poissons de la base de donn�es (DAO -> DO -> getters du DO) qu'on va ins�rer dans la partie web (->poissonVO)
			poissonVO.setNom(p.getNom());
			poissonVO.setCode(p.getCode());
			poissonVO.setCouleur(p.getCouleur());
			poissonVO.setDescription(p.getDescription());
			poissonVO.setDimension(p.getLongueur() + "x" + p.getLargeur());
			
			listePoisson.add(poissonVO);
			
		}
		
		return listePoisson;
		
	}

}
