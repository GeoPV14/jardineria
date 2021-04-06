package com.jardineria.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PEDIDOS")
public class Pedido {
	
	@Id
	@Column(name = "CODIGOPEDIDO", length = 3, nullable = false)
	private String codPedido;
	
	@Column(name = "FECHAPEDIDO", nullable = false)
	private Date fechPedido;
	
	@Column(name = "FECHAESPERADA", nullable = false)
	private Date fechEsperada;
	
	@Column(name = "FECHAENTREGA")
	private Date fechEntrega;
	
	@Column(name = "ESTADO", length = 15, nullable = false)
	private String estado;
	
	@Column(name = "COMENTARIOS", length = 200)
	private String comentPedido;
	
	/* * * Relaciones * * */

	
	@ManyToOne
	@JoinColumn(name = "CODIGOCLIENTES")
	private Clientes pedidoCliente;

	

	/* * Contructores_Getters&Setters * */
	
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

	public void setFechPedido(Date date) {
		this.fechPedido = date;

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
