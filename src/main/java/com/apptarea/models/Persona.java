package com.apptarea.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer idPersona;
	
	@Column(name="nombres", nullable = false, length = 70)
	private String nombres;
	
	@Column(name="apellidos", nullable = false, length = 70)
	private String apellidos;

	public Persona(Integer idPersona, String nombres, String apellidos) {
		//super();
		this.idPersona = idPersona;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public Persona() {
		//super();
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
