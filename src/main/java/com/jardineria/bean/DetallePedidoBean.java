package com.jardineria.bean;

public class DetallePedidoBean {
	
	private int idDetallePedidos;
	private int cantidad;
	private int precioUnidad;
	private int numeroLinea;
	
	public DetallePedidoBean() {
		super();
	}

	public DetallePedidoBean(int idDetallePedidos, int cantidad, int precioUnidad, int numeroLinea) {
		super();
		this.idDetallePedidos = idDetallePedidos;
		this.cantidad = cantidad;
		this.precioUnidad = precioUnidad;
		this.numeroLinea = numeroLinea;
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
	
	

}
