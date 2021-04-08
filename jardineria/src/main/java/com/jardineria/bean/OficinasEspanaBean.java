package com.jardineria.bean;

public class OficinasEspanaBean {
	
	private String ciudad;
	private String cp;
	
	public OficinasEspanaBean() {
		super();
	}

	public OficinasEspanaBean(String ciudad, String cp) {
		super();
		this.ciudad = ciudad;
		this.cp = cp;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}
	
	

}
