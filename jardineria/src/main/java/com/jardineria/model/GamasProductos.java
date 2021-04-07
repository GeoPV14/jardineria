package com.jardineria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GAMASPRODUCTOS")
public class GamasProductos {
	
	@Id
	@Column(name = "GAMA", length = 50, nullable = false)
	private String gama;
	
	@OneToMany(mappedBy = "gamaProducto")
	private List<Productos> productoList;

	public GamasProductos() {
		super();
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}
	
}
