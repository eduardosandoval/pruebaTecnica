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
import com.pruebatecnica.service.CamareroService;
import com.pruebatecnica.service.ClienteService;
import com.pruebatecnica.service.FacturaService;
import com.pruebatecnica.service.FacturaVwService;
import com.pruebatecnica.service.MesaService;
import com.google.gson.Gson;

@Component
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class FacturaController {
	Gson gson = new Gson();

	@Autowired
	CamareroService camareroService;

	@Autowired
	MesaService mesaService;


	@Autowired
	ClienteService clienteService;
	
	@Autowired
	FacturaService facturaService;


	@Autowired
	FacturaVwService FacturaVwService;
	
	
	@GetMapping(value = "/getCamarerosFactura", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCamareros() {
		try {
			List<Camarero> response =camareroService.getCamareros();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	

	@GetMapping(value = "/getClientesFactura", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getClientes() {
		try {
			List<Cliente> response = clienteService.getClientes();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	

	@GetMapping(value = "/getFacturaVw", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFacturaVw() {
		try {
			List<FacturaVw> response = FacturaVwService.getFacturaVw();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	
	@GetMapping(value = "/getFacturaVwId/{idFactura}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFacturaVwId(@PathVariable int idFactura) {
		try {
			List<FacturaVw> response = FacturaVwService.getFacturaVwId(idFactura);
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}


	@GetMapping(value = "/getMesasFactura", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getMesas() {
		try {
			List<Mesa> response = mesaService.getMesas();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	

	@GetMapping(value = "/getFacturas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFacturas() {
		try {
			List<FacturaDTO> response = facturaService.getFacturas();
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@PostMapping(value = "/saveFactura", produces = MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> saveFactura(@RequestBody Factura facturaDTO) {
		try {
			int respuesta = facturaService.saveFactura(facturaDTO);

			return new ResponseEntity<>(respuesta, HttpStatus.OK);

			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
		

	}
}
