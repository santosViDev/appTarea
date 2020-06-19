package com.apptarea.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleVenta;
	
	private Integer idVenta;
	
	private Integer idProducto;
	
	private Integer monto;

	public DetalleVenta(Integer idDetalleVenta, Integer idVenta, Integer idProducto, Integer monto) {
		//super();
		this.idDetalleVenta = idDetalleVenta;
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.monto = monto;
	}

	public DetalleVenta() {
		//super();
	}

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}
}
	
