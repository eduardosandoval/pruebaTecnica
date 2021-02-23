package com.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@NamedNativeQuery(name = "Cocinero.getCocineros", query = " SELECT * from cocinero ", resultClass = Cocinero.class)
@NamedNativeQuery(name = "Cocinero.getCocinerosId", query = " SELECT * from cocinero where idcocinero=:idCocinero", resultClass = Cocinero.class)

@Entity
@Data
@Table(name = "cocinero")
public class Cocinero {

	@Id
	@SequenceGenerator(name = "sec_cocinero", sequenceName = "sec_cocinero", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_cocinero")
	@Column(name = "idcocinero", unique = true)
	private int idcocinero;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = "apellido2")
	private String apellido2;
	public int getIdcocinero() {
		return idcocinero;
	}
	public void setIdcocinero(int idcocinero) {
		this.idcocinero = idcocinero;
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
