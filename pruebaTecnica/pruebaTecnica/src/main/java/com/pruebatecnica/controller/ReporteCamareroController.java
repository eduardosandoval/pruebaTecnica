package com.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dto.FacturaDTO;
import com.pruebatecnica.entity.Camarero;
import com.pruebatecnica.entity.Cliente;
import com.pruebatecnica.entity.Factura;
import com.pruebatecnica.entity.FacturaVw;
import com.pruebatecnica.entity.Mesa;
import com.pruebatecnica.entity.ReporteCamareroVw;
import com.pruebatecnica.service.CamareroService;
import com.pruebatecnica.service.ClienteService;
import com.pruebatecnica.service.FacturaService;
import com.pruebatecnica.service.FacturaVwService;
import com.pruebatecnica.service.MesaService;
import com.pruebatecnica.service.ReporteCamareroVwService;
import com.google.gson.Gson;

@Component
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ReporteCamareroController {
	Gson gson = new Gson();


	@Autowired
	ReporteCamareroVwService reporteCamareroVwService;
	
	
	
	

	@GetMapping(value = "/getReporteCamarero", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getReporteCamarero() {
		try {
			List<ReporteCamareroVw> response = reporteCamareroVwService.getReporteCamarero();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	
}
