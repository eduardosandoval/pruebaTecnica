 	package com.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@NamedNativeQuery(name = "Cliente.getClientes", query = " SELECT * from cliente ", resultClass = Cliente.class)
@NamedNativeQuery(name = "Cliente.getClientesId", query = " SELECT * from cliente where id_cliente=:idCliente", resultClass = Cliente.class)

@Entity

@Table(name = "cliente")
public class Cliente {

	@Id
	@SequenceGenerator(name = "sec_cliente", sequenceName = "sec_cliente", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_cliente")
	@Column(name = "id_cliente", unique = true)
	private int id_cliente;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido1")
	private String apellido1;
	
	@Column(name = "apellido2")
	private String apellido2;
	
	@Column(name = "observaciones")
	private String observaciones;

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	}