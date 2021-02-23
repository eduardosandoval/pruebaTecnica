package com.pruebatecnica.impl;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebatecnica.entity.Mesa;
import com.pruebatecnica.repository.MesaRepository;
import com.pruebatecnica.service.MesaService;

@Service
public class MesaServiceImpl implements MesaService {
	@Autowired
	MesaRepository mesaRepository;

	
	public List<Mesa> getMesas() {
		return mesaRepository.getMesas();
	}

	public List<Mesa> getMesasId(int idMesa) {
		return mesaRepository.getMesasId(idMesa);
	}

	@Transactional
	public int saveMesa(Mesa mesa) {
		try {
			mesaRepository.save(mesa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	
}
