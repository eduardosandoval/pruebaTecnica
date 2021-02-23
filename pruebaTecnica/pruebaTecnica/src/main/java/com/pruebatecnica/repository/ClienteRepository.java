package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.entity.Cliente;




@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
	

	@Query(name = "Cliente.getClientes")
	List<Cliente> getclientes();
	


	@Query(name = "Cliente.getClientesId")
	List<Cliente> getClientesId(@Param("idCliente") int idCliente);
	

}
