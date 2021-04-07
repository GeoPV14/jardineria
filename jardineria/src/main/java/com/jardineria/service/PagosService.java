package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.PagosBean;

public interface PagosService{

	public String savePagos(PagosBean pagosBean);
	public boolean updatePagos(PagosBean pagosBean);
	public PagosBean findOPagosById(String idPago);
	public List<PagosBean> mostrarPagos();
	public boolean deletePagosById(String idPagos);
}
