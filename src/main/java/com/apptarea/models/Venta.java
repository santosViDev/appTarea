package com.apptarea.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;	
	
	@Column(name = "idPersona", nullable = false)
	private Integer idPersona;	
	private Double importe;
	
	public Venta(Integer idProducto, LocalDateTime fecha, Integer idPersona, Double importe) {
		//super();
		this.idProducto = idProducto;
		this.fecha = fecha;
		this.idPersona = idPersona;
		this.importe = importe;
	}

	public Venta() {
		//super();
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
}
