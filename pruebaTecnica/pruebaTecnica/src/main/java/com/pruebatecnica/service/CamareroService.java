package com.pruebatecnica.service;

import java.util.List;
import com.pruebatecnica.entity.Camarero;

public interface CamareroService {
	
List<Camarero> getCamareros();
List<Camarero> getCamarerosId(int idCamarero);
public int saveCamarero(Camarero camarero);

}
