package com.jardineria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OFICINAS")
public class Oficina {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGOOFICINA", length = 3, nullable = false)
	private String codOficina;
	
	@Column(name = "CIUDAD", nullable = false)
	private String ciudad;
	
	@Column(name = "PAIS", nullable = false)
	private String pais;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "CODIGOPOSTAL", nullable = false)
	private String cp;
	
	@Column(name = "TELEFONO", nullable = false)
	private String telefono;
	
	@Column(name = "LINEADIRECCION1", nullable = false)
	private String lineDirec01;
	
	@Column(name = "LINEADIRECCION2")
	private String lineDirec02;
	
	/* * * Relaciones * * */
	
	@OneToMany(mappedBy = "oficina")
	private List<Oficina> oficina;
	
	/* * Contructores_Getters&Setters * */
	
	
	public Oficina() {
	}

	public Oficina(String codOficina, String ciudad, String pais, String region, String cp, String telefono,
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
