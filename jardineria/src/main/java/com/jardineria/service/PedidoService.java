package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.PedidoBean;

public interface PedidoService {
<<<<<<< HEAD
	public int savePedido(PedidoBean pedidoBean);
=======
	public String savePedido(PedidoBean pedidoBean);
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
	public boolean updatePedido(PedidoBean pedidoBean);
	public PedidoBean findPedidoById(String idPedido);
	public List<PedidoBean> mostrarPedido();
	public boolean deletePedidoById(String idPedido);

}
