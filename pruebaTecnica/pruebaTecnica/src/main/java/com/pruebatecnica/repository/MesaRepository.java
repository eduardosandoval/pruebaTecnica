package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebatecnica.entity.Mesa;

@Repository
public interface MesaRepository extends CrudRepository<Mesa, Integer> {
	
	

	@Query(name = "Mesa.getMesas")
	List<Mesa> getMesas();
	


	@Query(name = "Mesa.getMesasId")
	List<Mesa> getMesasId(@Param("idMesa") int idMesa);
	

}
