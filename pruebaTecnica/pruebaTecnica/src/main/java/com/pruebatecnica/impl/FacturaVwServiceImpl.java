package com.pruebatecnica.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebatecnica.dto.FacturaDTO;
import com.pruebatecnica.entity.Camarero;
import com.pruebatecnica.entity.Cliente;
import com.pruebatecnica.entity.Cocinero;
import com.pruebatecnica.entity.Factura;
import com.pruebatecnica.entity.FacturaVw;
import com.pruebatecnica.entity.Mesa;
import com.pruebatecnica.repository.DetalleFacturaRepository;
import com.pruebatecnica.repository.FacturaRepository;
import com.pruebatecnica.repository.FacturaVwRepository;
import com.pruebatecnica.service.FacturaService;
import com.pruebatecnica.service.FacturaVwService;

@Service
public class FacturaVwServiceImpl implements FacturaVwService {

	
	@Autowired
	FacturaVwRepository facturaVwRepository;



	@Override
	public List<FacturaVw> getFacturaVw() {
		return facturaVwRepository.getFacturaVw();
	}

	@Override
	public List<FacturaVw> getFacturaVwId(int idFactura) {
		return facturaVwRepository.getFacturaVwId(idFactura);
	}


}
