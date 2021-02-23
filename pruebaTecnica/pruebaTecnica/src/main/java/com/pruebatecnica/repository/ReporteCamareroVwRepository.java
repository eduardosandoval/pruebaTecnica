package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnica.entity.FacturaVw;
import com.pruebatecnica.entity.ReporteCamareroVw;
@Repository
public interface ReporteCamareroVwRepository extends  CrudRepository<FacturaVw, Integer> {


	@Query(name = "ReporteCamareroVw.getReporteCamarero")
	List<ReporteCamareroVw> getReporteCamarero();
	
}
