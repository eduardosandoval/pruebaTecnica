package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.entity.FacturaVw;
import com.pruebatecnica.entity.Mesa;

public interface FacturaVwService {

	List<FacturaVw> getFacturaVw();
	List<FacturaVw> getFacturaVwId(int idFactura);

}
