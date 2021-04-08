package com.jardineria.bean;

public class EmpleadosNyCBean {
	private String nombre;
	private String puesto;
	
	public EmpleadosNyCBean() {
		super();
	}

	public EmpleadosNyCBean(String nombre, String puesto) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
