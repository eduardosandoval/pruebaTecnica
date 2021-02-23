package com.pruebatecnica.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import lombok.Data;


@NamedNativeQuery(name = "FacturaVw.getFacturaVw", query = " SELECT * from facturaVw ", resultClass = FacturaVw.class)
@NamedNativeQuery(name = "FacturaVw.getFacturaVwId", query = " SELECT * from facturaVw where idfactura=:idFactura ", resultClass = FacturaVw.class)

@Entity
@Data
@Table(name = "facturaVw")
public class FacturaVw {
    @Id
	@Column(name = "idfactura")
	private int idfactura;
	@Column(name = "idcliente")
	private int idcliente;
	@Column(name = "nombrecliente")
	private String nombrecliente;
	@Column(name = "idcamarero")
	private int idcamarero;
	@Column(name = "nombrecamarero")
	private String nombrecamarero;
	@Column(name = "fechafactura")
	private Date fechafactura;
	@Column(name = "idmesa")
	private int idmesa;
	
	
	public int getIdfactura() {
		return idfactura;
	}
	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public int getIdcamarero() {
		return idcamarero;
	}
	public void setIdcamarero(int idcamarero) {
		this.idcamarero = idcamarero;
	}
	public String getNombrecamarero() {
		return nombrecamarero;
	}
	public void setNombrecamarero(String nombrecamarero) {
		this.nombrecamarero = nombrecamarero;
	}
	public Date getFechafactura() {
		return fechafactura;
	}
	public void setFechafactura(Date fechafactura) {
		this.fechafactura = fechafactura;
	}
	public int getIdmesa() {
		return idmesa;
	}
	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}
	
	
}
