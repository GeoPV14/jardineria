package com.jardineria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	
	@Id
	@Column(name = "CODIGOCLIENTE", length = 50)
	private String codigoCliente;
	
	@Column(name = "NOMBRECLIENTE", length = 50, nullable = false)
	private String nombreCliente;
	
	@Column(name = "NOMBRECONTACTO", length = 30)
	private String nombreContacto;
	
	@Column(name = "APELLIDOCONTACTO", length = 30)
	private String apellidoContacto;
	
	@Column(name = "TELEFONO", length = 15, nullable = false)
	private String telefono;
	
	@Column(name = "FAX", length = 15, nullable = false)
	private String fax;
	
	@Column(name = "LINEADIRECCION1", length = 50, nullable = false)
	private String lineaDireccion1;
	
	@Column(name = "LINEADIRECCION2", length = 50)
	private String lineaDireccion2;
	
	@Column(name = "CIUDAD", length = 50, nullable = false)
	private String ciudad;
	
	@Column(name = "REGION", length = 50)
	private String region;
	
	@Column(name = "PAIS", length = 50)
	private String pais;
	
	@Column(name = "CODIGOPOSTAL", length = 10)
	private String codigoPostal;
	
	@Column(name = "LIMITECREDITO")
	private double limiteCredito;
	
	@OneToMany(mappedBy = "clientes")
	private List<Pagos> pagoList;
	
	@ManyToOne 
	@JoinColumn(name = "CODIGOEMPLEADO")
	private Empleados empleado;
	
	@OneToMany(mappedBy = "pedidoCliente")
	private List<Pedido> pedidoList;

	public Clientes() {
		super();
	}

	public Clientes(String codigoCliente) {
		super();
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLineaDireccion1() {
		return lineaDireccion1;
	}

	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}

	public String getLineaDireccion2() {
		return lineaDireccion2;
	}

	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public List<Pagos> getPagoList() {
		return pagoList;
	}

	public void setPagoList(List<Pagos> pagoList) {
		this.pagoList = pagoList;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public List<Pedido> getPedidoList() {
		return pedidoList;
	}

	public void setPedidoList(List<Pedido> pedidoList) {
		this.pedidoList = pedidoList;
	}
	
}
