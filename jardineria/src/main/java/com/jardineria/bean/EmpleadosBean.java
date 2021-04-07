package com.jardineria.bean;

public class EmpleadosBean {
	
	private int codigoEmpleado;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String extension;
	private String email;
	private String puesto;
	
	public EmpleadosBean() {
		super();
	}

	public EmpleadosBean(int codigoEmpleado, String nombre, String apellido1, String apellido2, String extension,
			String email, String puesto) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.extension = extension;
		this.email = email;
		this.puesto = puesto;
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
	
	
	
}
