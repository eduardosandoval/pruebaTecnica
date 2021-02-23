package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.entity.Cocinero;

public interface CocineroService {

	List<Cocinero> getCocineros();
	List<Cocinero> getCocinerosId(int idCocinero);

	public int saveCocinero(Cocinero cocinero);
}
