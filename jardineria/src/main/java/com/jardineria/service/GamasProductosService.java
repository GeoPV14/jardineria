package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.GamasProductosBean;

public interface GamasProductosService {
	
	public boolean saveGamaProducto(GamasProductosBean gamaProductoBean);
	public GamasProductosBean findByIdGamaProducto(Integer id);
	public List<GamasProductosBean> findAllGamasProductos();
	public boolean updateGamaProducto(GamasProductosBean gamaProductoBean);
	public boolean deleteGamaProducto(Integer id);
}
