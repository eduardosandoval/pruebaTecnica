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
import com.google.gson.Gson;
import com.pruebatecnica.entity.Cocinero;
import com.pruebatecnica.entity.DetalleFactura;
import com.pruebatecnica.service.CocineroService;
import com.pruebatecnica.service.DetalleFacturaService;


@Component
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class DetalleFacturaController {
	Gson gson = new Gson();

	@Autowired
	CocineroService cocineroService;
	@Autowired
	DetalleFacturaService detalleFacturaService;


	@GetMapping(value = "/getCocinerosFactura", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCocineros() {
		try {
			List<Cocinero> response = cocineroService.getCocineros();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	

	@GetMapping(value = "/getDetalleFacturaId/{idFactura}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getDetalleProyecto(@PathVariable int idFactura) {
		try {
			List<DetalleFactura> response = detalleFacturaService.getDetalleFacturaId(idFactura);
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@PostMapping(value = "/saveDetalleFactura", produces = MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> saveDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
		try {
			int respuesta = detalleFacturaService.saveDetalleFactura(detalleFactura);

			return new ResponseEntity<>(respuesta, HttpStatus.OK);

			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
		

	}
}
