package com.pruebatecnica.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import lombok.Data;


@NamedNativeQuery(name = "ReporteCamareroVw.getReporteCamarero", query = " SELECT * from reporteCamareroVw ", resultClass = ReporteCamareroVw.class)

@Entity
@Data
@Table(name = "reporteCamareroVw")
public class ReporteCamareroVw {
    @Id
	@Column(name = "idcamarero")
	private int idcamarero;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = " mes")
	private String  mes;
	@Column(name = "sum")
	private int sum;
	
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
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	
	
}
