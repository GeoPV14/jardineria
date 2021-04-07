package com.jardineria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GAMASPRODUCTOS")
public class GamasProductos {
	
	
	
	@Id
	@Column(name = "GAMA", length = 50, nullable = false)
	private String gama;

	public GamasProductos() {
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}
	
}
