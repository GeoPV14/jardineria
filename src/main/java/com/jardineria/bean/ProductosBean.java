package com.jardineria.bean;

public class ProductosBean {

	private String codigoProducto;
	private String nombre;
	private String gama;
	private String dimensiones;
	private String proveedor;
	private String descripcion;
	private double cantidadEnStock;
	private double precioVenta;
	private double precioProveedor;
	
	public ProductosBean() {
	}
	public ProductosBean(String codigoProducto, String nombre, String gama, String dimensiones, String proveedor,
			String descripcion, double cantidadEnStock, double precioVenta, double precioProveedor) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.cantidadEnStock = cantidadEnStock;
		this.precioVenta = precioVenta;
		this.precioProveedor = precioProveedor;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCantidadEnStock() {
		return cantidadEnStock;
	}
	public void setCantidadEnStock(double cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getPrecioProveedor() {
		return precioProveedor;
	}
	public void setPrecioProveedor(double precioProveedor) {
		this.precioProveedor = precioProveedor;
	}
	
	
	
}
