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
import com.pruebatecnica.entity.ReporteCamareroVw;
import com.pruebatecnica.repository.DetalleFacturaRepository;
import com.pruebatecnica.repository.FacturaRepository;
import com.pruebatecnica.repository.FacturaVwRepository;
import com.pruebatecnica.repository.ReporteCamareroVwRepository;
import com.pruebatecnica.service.FacturaService;
import com.pruebatecnica.service.FacturaVwService;
import com.pruebatecnica.service.ReporteCamareroVwService;

@Service
public class ReporteCamreroServiceImpl implements ReporteCamareroVwService {

	
	@Autowired
	ReporteCamareroVwRepository reporteCamareroVwRepository;

	@Override
	public List<ReporteCamareroVw> getReporteCamarero() {
		// TODO Auto-generated method stub
		return reporteCamareroVwRepository.getReporteCamarero();
	}

	


}
