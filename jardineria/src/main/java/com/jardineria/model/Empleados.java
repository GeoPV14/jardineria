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
@Table(name = "EMPLEADOS")
public class Empleados {
	
	@Id
	@Column(name = "CODIGOEMPLEADO", nullable = false)
	private int codigoEmpleado;
	
	@Column(name = "NOMBRE", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "APELLIDO1", length = 50, nullable = false)
	private String apellido1;
	
	@Column(name = "APELLIDO2", length = 50)
	private String apellido2;
	
	@Column(name = "EXTENSION", length = 50, nullable = false)
	private String extension;
	
	@Column(name = "EMAIL", length = 50, nullable = false)
	private String email;
	
	@Column(name = "PUESTO", length = 50)
	private String puesto;
	
	/*@Column(name = "CODIGOOFICINA", length = 10)
	private String codOficina;*/
	
	@ManyToOne
	@JoinColumn(name = "codOficina")
	private Oficina oficina;
	
	@ManyToOne
	@JoinColumn(name = "codigoJefe")
	private Empleados jefe;
	
	@OneToMany(mappedBy = "jefe")
	private List<Empleados> empleados;

	public Empleados() {
		super();
	}

	public Empleados(int codigoEmpleado) {
		super();
		this.codigoEmpleado = codigoEmpleado;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/*public String getCodOficina() {
		return codOficina;
	}

	public void setCodOficina(String codOficina) {
		this.codOficina = codOficina;
	}*/

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	public Empleados getJefe() {
		return jefe;
	}

	public void setJefe(Empleados jefe) {
		this.jefe = jefe;
	}

	public List<Empleados> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	
	
		
	
}
