package com.jardineria.bean;

public class OficinaBean {
	private String codOficina;
	private String ciudad;
	private String pais;
	private String region;
	private String cp;
	private String telefono;
	private String lineDirec01;
	private String lineDirec02;
	
	/*Contructores_Getters&Setters*/
	
	public OficinaBean() {
	}

	public OficinaBean(String codOficina, String ciudad, String pais, String region, String cp, String telefono,
			String lineDirec01, String lineDirec02) {
		this.codOficina = codOficina;
		this.ciudad = ciudad;
		this.pais = pais;
		this.region = region;
		this.cp = cp;
		this.telefono = telefono;
		this.lineDirec01 = lineDirec01;
		this.lineDirec02 = lineDirec02;
	}

	public String getCodOficina() {
		return codOficina;
	}

	public void setCodOficina(String codOficina) {
		this.codOficina = codOficina;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getLineDirec01() {
		return lineDirec01;
	}

	public void setLineDirec01(String lineDirec01) {
		this.lineDirec01 = lineDirec01;
	}

	public String getLineDirec02() {
		return lineDirec02;
	}

	public void setLineDirec02(String lineDirec02) {
		this.lineDirec02 = lineDirec02;
	}
	
	
	
}
