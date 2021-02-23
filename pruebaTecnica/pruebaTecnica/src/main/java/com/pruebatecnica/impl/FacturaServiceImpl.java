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
import com.pruebatecnica.entity.Mesa;
import com.pruebatecnica.repository.DetalleFacturaRepository;
import com.pruebatecnica.repository.FacturaRepository;
import com.pruebatecnica.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService {

	
	@Autowired
	FacturaRepository facturaRepository;


	@Autowired
	DetalleFacturaRepository detalleFacturaRepository;
	


	@Override
	public List<Mesa> getMesaFactura() {
		return facturaRepository.getMesaFactura();
	}

	
	@Override
	public List<Camarero> getCamareroFactura() {
		return facturaRepository.getCamareroFactura();
	}

	@Transactional
	public int saveFactura(Factura facturaDTO) {
		
		
		try {
			Calendar calendar = Calendar.getInstance();

			calendar.setTime(new Date());
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf.setTimeZone(TimeZone.getTimeZone("GMT-5"));
			Date fechaCreacion = calendar.getTime();
			facturaDTO.setFechafactura(fechaCreacion);
			
			 facturaRepository.save(facturaDTO);

		}catch (Exception e) {
           e.printStackTrace();
		}
		return 0;
	}

	
	public List<FacturaDTO> getFacturas() {
		// TODO Auto-generated method stub
		return facturaRepository.getFacturas();
	}

	public List<Factura> getFacturasId(int idFactura) {
		// TODO Auto-generated method stub
		return facturaRepository.getFacturasId(idFactura);
	}


}
