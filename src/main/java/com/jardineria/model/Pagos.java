package com.jardineria.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PAGOS")
public class Pagos {

	
	@Id
	@Column(name="IDTRANSACCION", length = 3, nullable = false)
	private String idTransaccion;
	@Column(name="CANTIDAD")
	private double cantidad;
	@Column(name="FECHAPAGO")
	private Date fechaPago;
	@Column(name="FORMAPAGO")
	private  String formaPAgo;
	
	@ManyToOne
	@JoinColumn(name = "CODIGOCLIENTE")
	private Clientes codigoCliente;
	
	
	
	
	
	public Pagos() {
	}
	public Pagos(Clientes codigoCliente, String formaPAgo, String idTransaccion, Date fechaPago, double cantidad) {
		this.codigoCliente = codigoCliente;
		this.formaPAgo = formaPAgo;
		this.idTransaccion = idTransaccion;
		this.fechaPago = fechaPago;
		this.cantidad = cantidad;
	}
	public Clientes getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Clientes codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getFormaPAgo() {
		return formaPAgo;
	}
	public void setFormaPAgo(String formaPAgo) {
		this.formaPAgo = formaPAgo;
	}
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
}
