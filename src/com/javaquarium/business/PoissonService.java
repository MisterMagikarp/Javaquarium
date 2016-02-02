package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.web.PoissonVO;

public class PoissonService implements IPoissonService {
	
	@Override
	public List<PoissonVO> createListPoissons(){
		
		//Liste qui va contenir des poissons
		List<PoissonVO> listePoisson = new ArrayList<PoissonVO>();
		
		// On créer un nouveau poisson grâce au bean
		final PoissonVO poisson = new PoissonVO("Nemo", "", "Orange", "20.0*15.0","15");
		
		//On va ajouter ce poisson récemment créé dans la liste
		listePoisson.add(poisson);
		
		return listePoisson;
		
	}

}
