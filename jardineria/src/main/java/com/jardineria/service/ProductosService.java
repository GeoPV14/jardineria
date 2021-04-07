package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.ProductosBean;

public interface ProductosService {
	
	public String saveProducto(ProductosBean productoBean);

	public boolean updateProducto(ProductosBean productoBean);
	public ProductosBean findPedidoById(String idProducto);
	public List<ProductosBean> mostrarProducto();
	public boolean deleteProductoById(String idProducto);
	
}
