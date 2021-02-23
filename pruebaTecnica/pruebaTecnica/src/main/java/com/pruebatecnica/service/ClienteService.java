package com.pruebatecnica.service;

import java.util.List;
import com.pruebatecnica.entity.Cliente;

public interface ClienteService {
	
List<Cliente> getClientes();
List<Cliente> getClientesId(int idCliente);

public int saveCliente(Cliente cliente);

}
