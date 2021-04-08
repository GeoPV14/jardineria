package com.jardineria.bean;

public class ClientesPaisBean {
	private String paisClient;
	private int countClient;
	
	public ClientesPaisBean() {
	}

	public ClientesPaisBean(String paisClient, int countClient) {
		this.paisClient = paisClient;
		this.countClient = countClient;
	}

	public String getPaisClient() {
		return paisClient;
	}

	public void setPaisClient(String paisClient) {
		this.paisClient = paisClient;
	}

	public int getCountClient() {
		return countClient;
	}

	public void setCountClient(int countClient) {
		this.countClient = countClient;
	}
	
	

}
