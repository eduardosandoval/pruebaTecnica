package com.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pruebatecnica.dto.FacturaDTO;
import com.pruebatecnica.entity.Camarero;
import com.pruebatecnica.entity.Factura;
import com.pruebatecnica.entity.Mesa;




 @Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

	


//	   public default   List<FacturaDTO>  getFacturas() {
//	      String query = " SELECT  f.idfactura, f.idcliente,cl.nombre nombrecliente, "
//				  +"  f.idcamarero,c.nombre nombrecamarero,f.fechafactura, f.idmesa " 
//	              +"  from factura f "
//			      +"  inner join camarero c on f.idcamarero =c.idcamarero "
//			      +"  inner join cliente cl on f.idcliente = cl.id_cliente ";
//	      return (List<FacturaDTO>) em.createQuery(query, FacturaDTO.class).getSingleResult();
//	   }
	@Query(value=" SELECT  f.idfactura, f.idcliente,cl.nombre nombrecliente, "
			  +"  f.idcamarero,c.nombre nombrecamarero,f.fechafactura, f.idmesa " 
              +"  from factura f "
		      +"  inner join camarero c on f.idcamarero =c.idcamarero "
		      +"  inner join cliente cl on f.idcliente = cl.id_cliente ",nativeQuery = true)
    List<FacturaDTO> getFacturas();

//	@Query(name = "Factura.getFacturas")
//	List<Factura> getFacturas();
//	


	@Query(name = "Factura.getFacturasId")
	List<Factura> getFacturasId(@Param("idFactura") int idFactura);
	

	
	@Query(value = "SELECT  (nombre ||' '|| apellido1) nombre , idcamarero from camarero ",nativeQuery = true)
	List<Camarero> getCamareroFactura();
	

	@Query(value = "SELECT  (nombre ||' '|| apellido1) nombre , idmesa from mesa ",nativeQuery = true)
	List<Mesa> getMesaFactura();
	

}
