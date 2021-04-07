package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.OficinaBean;

public interface OficinaService {
	public String saveOficina(OficinaBean oficinaBean);
	public boolean updateOficina(OficinaBean oficinaBean);
	public OficinaBean findOficinaById(String idOficina);
	public List<OficinaBean> mostrarOficina();
	public boolean deleteOficinaById(String idOficina);

}
