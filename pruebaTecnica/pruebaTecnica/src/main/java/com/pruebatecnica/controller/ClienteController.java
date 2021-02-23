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
import com.pruebatecnica.entity.Cliente;
import com.pruebatecnica.service.ClienteService;

import com.google.gson.Gson;
@Component
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ClienteController {
	Gson gson = new Gson();

	@Autowired
	ClienteService clienteService;

	@GetMapping(value = "/getClientes", produces = MediaType.APPLICATION_JSON_VALUE)
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

	@GetMapping(value = "/getClientesId/{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getClientesId(@PathVariable int idCliente ) {
		try {
			List<Cliente> response = clienteService.getClientesId(idCliente);
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@PostMapping(value = "/saveCliente", produces = MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> saveCliente(@RequestBody Cliente cliente) {
		try {
			int respuesta = clienteService.saveCliente(cliente);

			return new ResponseEntity<>(respuesta, HttpStatus.OK);

			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
		

	}
}
