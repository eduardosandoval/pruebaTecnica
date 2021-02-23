package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebatecnica.entity.Camarero;
import com.pruebatecnica.entity.FacturaVw;

@Repository
public interface FacturaVwRepository extends  CrudRepository<FacturaVw, Integer> {

	

	@Query(name = "FacturaVw.getFacturaVw")
	List<FacturaVw> getFacturaVw();
	
	@Query(name = "FacturaVw.getFacturaVwId")
	List<FacturaVw> getFacturaVwId(@Param("idFactura")int idFactura);
}
