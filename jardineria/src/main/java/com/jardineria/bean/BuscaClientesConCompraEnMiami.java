package com.jardineria.bean;

public class BuscaClientesConCompraEnMiami {

	private String nombreCliente;

	public BuscaClientesConCompraEnMiami() {
	}

	public BuscaClientesConCompraEnMiami(String nombreCliente) {
		super();
		this.nombreCliente = nombreCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Override
	public String toString() {
		return "BuscaClientesConCompraEnMiami [nombreCliente=" + nombreCliente + "]";
	}

}
