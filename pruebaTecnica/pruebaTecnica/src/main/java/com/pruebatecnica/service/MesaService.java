package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.entity.Mesa;

public interface MesaService {

	List<Mesa> getMesas();
	List<Mesa> getMesasId(int idMesa);

	public int saveMesa(Mesa mesa);
}
