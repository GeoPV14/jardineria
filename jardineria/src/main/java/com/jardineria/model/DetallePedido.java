package com.jardineria.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLEPEDIDOS")
public class DetallePedido {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDETALLEPEDIDOS")
	private int idDetallePedidos;
	
	@Column(name = "CANTIDAD", nullable = false)
	private int cantidad;
	
	@Column(name = "PRECIOUNIDAD", nullable = false)
	private int precioUnidad;
	
	@Column(name = "NUMEROLINEA", nullable = false)
	private int numeroLinea;
	
	@ManyToOne
	@JoinColumn(name = "codigoProducto")
	private Productos producto;
	
	@ManyToOne
	@JoinColumn(name = "codPedido")
	private Pedido pedido;

	public DetallePedido() {
		super();
	}

	public DetallePedido(int idDetallePedidos) {
		super();
		this.idDetallePedidos = idDetallePedidos;
	}

	public int getIdDetallePedidos() {
		return idDetallePedidos;
	}

	public void setIdDetallePedidos(int idDetallePedidos) {
		this.idDetallePedidos = idDetallePedidos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(int numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	

}
