package com.pruebatecnica.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebatecnica.entity.Camarero;
import com.pruebatecnica.repository.CamareroRepository;
import com.pruebatecnica.service.CamareroService;
@Service
public class CamareroServiceImpl implements CamareroService {
	@Autowired
	CamareroRepository camareroRepository;

	
	public List<Camarero> getCamareros() {
		return camareroRepository.getCamareros();
	}

	public List<Camarero> getCamarerosId(int idCamarero) {
		return camareroRepository.getCamarerosId(idCamarero);
	}

	@Transactional
	public int saveCamarero(Camarero camarero) {
		try {
			camareroRepository.save(camarero);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
