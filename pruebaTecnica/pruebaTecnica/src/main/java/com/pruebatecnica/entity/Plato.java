package com.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "plato")
public class Plato {
	
	@Id
	@SequenceGenerator(name = "sec_plato", sequenceName = "sec_plato", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "sec_plato")
	@Column(name = "idplato", unique = true)
	private int idplato;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
}
