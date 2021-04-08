package com.jardineria.bean;

public class EmpleadoNomApellBean {
	private int codigoEmpleado;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public EmpleadoNomApellBean() {
	}

	public EmpleadoNomApellBean(int codigoEmpleado, String nombre, String apellido1, String apellido2) {
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
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
	
	

}
