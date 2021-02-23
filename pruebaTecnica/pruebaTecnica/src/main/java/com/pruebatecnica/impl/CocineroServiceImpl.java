package com.pruebatecnica.impl;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebatecnica.entity.Cocinero;
import com.pruebatecnica.repository.CocineroRepository;
import com.pruebatecnica.service.CocineroService;

@Service
public class CocineroServiceImpl implements CocineroService {
	@Autowired
	CocineroRepository cocineroRepository;

	
	public List<Cocinero> getCocineros() {
		return cocineroRepository.getCocineros();
	}

	public List<Cocinero> getCocinerosId(int idCocinero) {
		return cocineroRepository.getCocinerosId(idCocinero);
	}

	@Transactional
	public int saveCocinero(Cocinero cocinero) {
		try {
			cocineroRepository.save(cocinero);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	
}
