package com.pruebatecnica.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@NamedNativeQuery(name = "Factura.getFacturas", query = " SELECT * from factura ", resultClass = Factura.class)
@NamedNativeQuery(name = "Factura.getFacturasId", query = " SELECT * from factura where idfactura=:idFactura", resultClass = Factura.class)


@Entity
@Data
@Table(name = "factura")
public class Factura {


	@Id
	@SequenceGenerator(name = "sec_factura", sequenceName = "sec_factura", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_factura")
	@Column(name = "idfactura", unique = true)
	private int idfactura;
	@Column(name = "idcliente")
	private int idcliente;
	@Column(name = "idcamarero")
	private int idcamarero;
	@Column(name = "idmesa")
	private int idmesa;
	@Column(name = "fechafactura")
	private Date fechafactura;
	
	
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
	public int getIdcamarero() {
		return idcamarero;
	}
	public void setIdcamarero(int idcamarero) {
		this.idcamarero = idcamarero;
	}
	public int getIdmesa() {
		return idmesa;
	}
	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}
	public Date getFechafactura() {
		return fechafactura;
	}
	public void setFechafactura(Date fechafactura) {
		this.fechafactura = fechafactura;
	}
	
	
}
