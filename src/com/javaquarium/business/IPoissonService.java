package com.javaquarium.business;

import java.util.List;

import com.javaquarium.beans.web.PoissonVO;

public interface IPoissonService {

	// rajout de public abstract pour je ne sais quelle raison???
	public abstract List<PoissonVO> createListPoissons();

}
