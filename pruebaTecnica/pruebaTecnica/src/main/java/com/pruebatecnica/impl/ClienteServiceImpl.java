package com.pruebatecnica.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebatecnica.entity.Cliente;
import com.pruebatecnica.repository.ClienteRepository;
import com.pruebatecnica.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public List<Cliente> getClientes() {
		return clienteRepository.getclientes();
	}

	public List<Cliente> getClientesId(int idCliente) {
		return clienteRepository.getClientesId(idCliente);
	}
	@Transactional
	public int saveCliente(Cliente cliente) {
		try {
			clienteRepository.save(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	
}
