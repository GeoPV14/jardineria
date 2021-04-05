package com.jardineria.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PEDIDOS")
public class Pedido {
	
	@Id
	@Column(name = "CODIGOPEDIDO")
	private String codPedido;
	
	@Column(name = "FECHAPEDIDO")
	private Date fechPedido;
	
	@Column(name = "FECHAESPERADA")
	private Date fechEsperada;
	
	@Column(name = "FECHACLIENTE")
	private Date fechEntrega;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "COMENTARIOS")
	private String comentPedido;
	
	
	//Agregar ORM de codigo del cliente

	
	/*Contructores_Getters&Setters*/
	
	public Pedido() {
	}
	
	
	public Pedido(String codPedido, Date fechPedido, Date fechEsperada, Date fechEntrega, String estado,
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
