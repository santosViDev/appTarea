package com.apptarea.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer idProducto;
	
	@Column(name="nombre", nullable = false, length = 20)
	private String nombre;
	
	@Column(name="marca", nullable = false, length = 20)
	private String marca;

	public Producto(Integer idProducto, String nombre, String marca) {
		//super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.marca = marca;
	}

	public Producto() {
		//super();
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
