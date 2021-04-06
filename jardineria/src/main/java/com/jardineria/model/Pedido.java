package com.jardineria.model;

<<<<<<< HEAD
import java.sql.Date;
=======
import java.util.Date;
import java.util.List;
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.Table;
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807


@Entity
@Table(name = "PEDIDOS")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGOPEDIDO", length = 3, nullable = false)
<<<<<<< HEAD
	private int codPedido;
	
	//@DateTimeFormat "dd/MM/yyyy"
	@Column(name = "FECHAPEDIDO", nullable = false)
	//@Temporal(TemporalType.DATE)
=======
	private String codPedido;
	
	
	@Column(name = "FECHAPEDIDO", nullable = false)
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
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
<<<<<<< HEAD
/*	
=======
	
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
	@OneToMany(mappedBy = "pedido")
	private List<Pedido> pedidoList;
	
	@ManyToOne
	@JoinColumn(name = "codPedido")
	private Pedido pedido;
<<<<<<< HEAD
*/	
=======
	
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
	/* * Contructores_Getters&Setters * */
	
	public Pedido() {
	}
	
	
<<<<<<< HEAD
	public Pedido(int codPedido, Date fechPedido, Date fechEsperada, Date fechEntrega, String estado,
=======
	public Pedido(String codPedido, Date fechPedido, Date fechEsperada, Date fechEntrega, String estado,
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
			String comentPedido) {
		this.codPedido = codPedido;
		this.fechPedido = fechPedido;
		this.fechEsperada = fechEsperada;
		this.fechEntrega = fechEntrega;
		this.estado = estado;
		this.comentPedido = comentPedido;
	}
<<<<<<< HEAD
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
=======
	public String getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(String codPedido) {
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
		this.codPedido = codPedido;
	}
	public Date getFechPedido() {
		return fechPedido;
	}
<<<<<<< HEAD
	public void setFechPedido(Date fechPedido) {
		this.fechPedido = fechPedido;
=======
	public void setFechPedido(Date date) {
		this.fechPedido = date;
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
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
