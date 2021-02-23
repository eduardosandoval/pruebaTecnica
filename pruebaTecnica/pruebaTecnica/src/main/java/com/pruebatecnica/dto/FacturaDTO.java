package com.pruebatecnica.dto;

import java.io.Serializable;
import java.util.Date;



public class FacturaDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idfactura;

	private int idcliente;

	private String nombrecliente;

	private int idcamarero;

	private String nombrecamarero;

	private int idmesa;

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
