package com.jardineria.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PEDIDOS")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGOPEDIDO", length = 3, nullable = false)
	private int codPedido;
	
	//@DateTimeFormat "dd/MM/yyyy"
	@Column(name = "FECHAPEDIDO", nullable = false)
	//@Temporal(TemporalType.DATE)
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
/*	
	@OneToMany(mappedBy = "pedido")
	private List<Pedido> pedidoList;
	
	@ManyToOne
	@JoinColumn(name = "codPedido")
	private Pedido pedido;
*/	
	/* * Contructores_Getters&Setters * */
	
	public Pedido() {
	}
	
	
	public Pedido(int codPedido, Date fechPedido, Date fechEsperada, Date fechEntrega, String estado,
			String comentPedido) {
		this.codPedido = codPedido;
		this.fechPedido = fechPedido;
		this.fechEsperada = fechEsperada;
		this.fechEntrega = fechEntrega;
		this.estado = estado;
		this.comentPedido = comentPedido;
	}
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
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
