package com.jardineria.bean;

import java.util.Date;


public class PagosBean {

	private double codigoCliente;
	private  String formaPAgo;
	private String idTransaccion;
	private Date fechaPago;
	private double cantidad;
	
	public PagosBean() {
	}
	public PagosBean(double codigoCliente, String formaPAgo, String idTransaccion, Date fechaPago, double cantidad) {
		super();
		this.codigoCliente = codigoCliente;
		this.formaPAgo = formaPAgo;
		this.idTransaccion = idTransaccion;
		this.fechaPago = fechaPago;
		this.cantidad = cantidad;
	}
	public double getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(double codigoCliente) {
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
