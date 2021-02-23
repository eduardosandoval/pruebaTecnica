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
import com.pruebatecnica.entity.Mesa;
import com.pruebatecnica.service.MesaService;
import com.google.gson.Gson;
@Component
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class MesaController {
	Gson gson = new Gson();

	@Autowired
	MesaService mesaService;

	@GetMapping(value = "/getMesas", produces = MediaType.APPLICATION_JSON_VALUE)
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

	@GetMapping(value = "/getMesasId/{idMesa}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getMesasId(@PathVariable int idMesa) {
		try {
			List<Mesa> response = mesaService.getMesasId(idMesa);
			String JSON = gson.toJson(response);

			System.out.println(response);
			return new ResponseEntity<>(JSON, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	@PostMapping(value = "/saveMesa", produces = MediaType.APPLICATION_JSON_VALUE,consumes =  MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<?> saveMesa(@RequestBody Mesa mesa) {
		try {
			int respuesta = mesaService.saveMesa(mesa);

			return new ResponseEntity<>(respuesta, HttpStatus.OK);

			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
		

	}
}
