package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.PedidoBean;

public interface PedidoService {
	public int savePedido(PedidoBean pedidoBean);
	public boolean updatePedido(PedidoBean pedidoBean);
	public PedidoBean findPedidoById(String idPedido);
	public List<PedidoBean> mostrarPedido();
	public boolean deletePedidoById(String idPedido);

}
