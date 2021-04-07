package com.jardineria.bean;

import java.sql.Date;

public class PedidoBean {
	private String codPedido;
	private Date fechPedido;
	private Date fechEsperada;
	private Date fechEntrega;
	private String estado;
	private String comentPedido;
	
	/*Contructores_Getters&Setters*/
	
	public PedidoBean() {
	}
	
	
	public PedidoBean(String codPedido, Date fechPedido, Date fechEsperada, Date fechEntrega, String estado,
			String comentPedido) {
		this.codPedido = codPedido;
		this.fechPedido = fechPedido;
		this.fechEsperada = fechEsperada;
		this.fechEntrega = fechEntrega;
		this.estado = estado;
		this.comentPedido = comentPedido;
	}


	public String getCodPedido() {
		return codPedido;
	}


	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}


	public Date getFechPedido() {
		return fechPedido;
	}


	public void setFechPedido(Date fechPedido) {
		this.fechPedido = fechPedido;
	}


	public Date getFechEsperada() {
		return fechEsperada;
	}


	public void setFechEsperada(Date fechEsperada) {
		this.fechEsperada = fechEsperada;
	}


	public Date getFechEntrega() {
		return fechEntrega;
	}


	public void setFechEntrega(Date fechEntrega) {
		this.fechEntrega = fechEntrega;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getComentPedido() {
		return comentPedido;
	}


	public void setComentPedido(String comentPedido) {
		this.comentPedido = comentPedido;
	}

	

}
