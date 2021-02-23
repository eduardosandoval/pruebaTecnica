package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebatecnica.entity.Cocinero;

@Repository
public interface CocineroRepository extends  CrudRepository<Cocinero, Integer> {

	

	@Query(name = "Cocinero.getCocineros")
	List<Cocinero> getCocineros();
	


	@Query(name = "Cocinero.getCocinerosId")
	List<Cocinero> getCocinerosId(@Param("idCocinero") int idCocinero);
}
