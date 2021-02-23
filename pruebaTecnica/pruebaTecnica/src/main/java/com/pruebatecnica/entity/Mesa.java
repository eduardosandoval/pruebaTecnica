package com.pruebatecnica.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
@NamedNativeQuery(name = "Mesa.getMesas", query = " SELECT * from mesa ", resultClass = Mesa.class)
@NamedNativeQuery(name = "Mesa.getMesasId", query = " SELECT * from mesa where idmesa=:idMesa", resultClass = Mesa.class)

@Entity
@Data
@Table(name = "mesa")
public class Mesa {

	@Id
	@SequenceGenerator(name = "sec_mesa", sequenceName = "sec_mesa", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_mesa")
	@Column(name = "idmesa", unique = true)
	private int idmesa;
	@Column(name = "ubicacion")
	private String ubicacion;
	@Column(name = "nunmaxpersonas")
	private int nunmaxpersonas;
	@Column(name = "identificacion")
	private int identificacion;
	public int getIdmesa() {
		return idmesa;
	}
	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}
	
	public int getNunmaxpersonas() {
		return nunmaxpersonas;
	}
	public void setNunmaxpersonas(int nunmaxpersonas) {
		this.nunmaxpersonas = nunmaxpersonas;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
}
