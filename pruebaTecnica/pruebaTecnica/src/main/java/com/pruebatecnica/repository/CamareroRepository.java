package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebatecnica.entity.Camarero;

@Repository
public interface CamareroRepository extends  CrudRepository<Camarero, Integer> {

	

	@Query(name = "Camarero.getCamareros")
	List<Camarero> getCamareros();
	


	@Query(name = "Camarero.getCamarerosId")
	List<Camarero> getCamarerosId(@Param("idcamarero") int idCamarero);
}
