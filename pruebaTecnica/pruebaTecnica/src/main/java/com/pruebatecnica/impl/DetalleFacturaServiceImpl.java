package com.pruebatecnica.impl;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebatecnica.entity.DetalleFactura;
import com.pruebatecnica.repository.DetalleFacturaRepository;
import com.pruebatecnica.service.DetalleFacturaService;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {
	@Autowired
	DetalleFacturaRepository detalleFacturaRepository;

	
	@Transactional
	public int saveDetalleFactura(DetalleFactura detalleFactura) {
		try {
			detalleFacturaRepository.save(detalleFactura);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	@Override
	public List<DetalleFactura> getDetalleFacturaId(int idFactura) {
		return detalleFacturaRepository.getDetalleFacturaId(idFactura);
	}


	
}
