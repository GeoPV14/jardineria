package com.jardineria.bean;

public class GamasProductosBean {
	
	
	private String gama;
	private int countGamaProd;
	
	public GamasProductosBean() {
		super();
	}

	public GamasProductosBean(String gama, int countGamaProd) {
		this.gama = gama;
		this.countGamaProd = countGamaProd;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public int getCountGamaProd() {
		return countGamaProd;
	}

	public void setCountGamaProd(int countGamaProd) {
		this.countGamaProd = countGamaProd;
	}

	
	
}
