package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebatecnica.entity.DetalleFactura;

@Repository
public interface DetalleFacturaRepository extends CrudRepository<DetalleFactura, Integer> {
	
	@Query(name = "DetalleFactura.getDetalleFacturaId")
	List<DetalleFactura> getDetalleFacturaId(@Param("idFactura") int idFactura);

}
