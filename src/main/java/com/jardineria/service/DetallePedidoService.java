package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.DetallePedidoBean;

public interface DetallePedidoService {
	public Integer saveDetallePedido(DetallePedidoBean detallePedidoBean);//Create
	public DetallePedidoBean findDetallePedidoById(Integer idDetallePedidos);//Read
	public boolean updateDetallePedido(DetallePedidoBean detallePedidoBean);//Update
	public boolean deleteDetallePedido(Integer idDetallePedidos);//Delete
	public List<DetallePedidoBean> findAllDetallePedido();//ReadAll
	

}
