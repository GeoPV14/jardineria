package com.jardineria.service;

import java.util.List;
import java.util.Set;

import com.jardineria.bean.BuscaClientesConCompraEnMiami;
import com.jardineria.bean.ClienteConPedidos;
import com.jardineria.bean.ClientesPedidosMiami;
import com.jardineria.bean.CodigoPedidoBean;
import com.jardineria.bean.PedidoBean;
import com.jardineria.bean.PedidoFinalPriceBean;

public interface PedidoService {
	public String savePedido(PedidoBean pedidoBean);
	public boolean updatePedido(PedidoBean pedidoBean);
	public PedidoBean findPedidoById(String idPedido);
	public List<PedidoBean> mostrarPedido();
	public boolean deletePedidoById(String idPedido);
	
	public Set<String> findAllStatusPedido();
	public List<CodigoPedidoBean> findCodPed();//Mostrar Codigos de pedidos por encima de la media

	public List<ClientesPedidosMiami> findClientesConPagoDeMiami();
	public List<ClienteConPedidos> findClientesAndPedido();

	
	public List<CodigoPedidoBean> mostrarCodPedMayor6();
	
	public List<PedidoFinalPriceBean> mostrarPrecioFinalPorPedido();
	public List<PedidoFinalPriceBean> findAllPedidoPriceAll();


}
