package com.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@NamedNativeQuery(name = "Camarero.getCamareros", query = " SELECT * from camarero ", resultClass = Camarero.class)
@NamedNativeQuery(name = "Camarero.getCamarerosId", query = " SELECT * from camarero where idCamarero=:idcamarero", resultClass = Camarero.class)

@Entity
@Table(name = "camarero")
public class Camarero {

	@Id
	@SequenceGenerator(name = "sec_camarero", sequenceName = "sec_camarero", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_camarero")
	@Column(name = "idcamarero", unique = true)
	private int idcamarero;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = "apellido2")
	private String apellido2;
	public int getIdcamarero() {
		return idcamarero;
	}
	public void setIdcamarero(int idcamarero) {
		this.idcamarero = idcamarero;
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
	
	

}
