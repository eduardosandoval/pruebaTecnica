package com.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@NamedNativeQuery(name = "DetalleFactura.getDetalleFacturaId", query = " SELECT * from detallefactura where idfactura=:idFactura", resultClass = DetalleFactura.class)

@Entity
@Data
@Table(name = "detallefactura")
public class DetalleFactura {
	

	@Id
	@SequenceGenerator(name = "sec_detallefactura", sequenceName = "sec_detallefactura", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_detallefactura")
	@Column(name = "iddetallefactura", unique = true)
	private int iddetallefactura;
	@Column(name = "idcocinero")
	private int idcocinero;
	@Column(name = "plato")
	private String plato;
	@Column(name = "importe")
	private int importe;
	@Column(name = "idfactura")
	private int idfactura;
	
	
	public int getIddetallefactura() {
		return iddetallefactura;
	}
	public void setIddetallefactura(int iddetallefactura) {
		this.iddetallefactura = iddetallefactura;
	}
	public int getIdcocinero() {
		return idcocinero;
	}
	public void setIdcocinero(int idcocinero) {
		this.idcocinero = idcocinero;
	}

	public String getPlato() {
		return plato;
	}
	public void setPlato(String plato) {
		this.plato = plato;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public int getIdfactura() {
		return idfactura;
	}
	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}
	
	
}
