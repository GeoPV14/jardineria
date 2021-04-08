package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.DetallePedidoBean;
import com.jardineria.bean.DetallePedidoCantidadPeticionesBean;
import com.jardineria.bean.GamaMasVendida;
import com.jardineria.bean.PedidosProductoGamaAromaticasCaroBean;
import com.jardineria.bean.DetallePedidoProdNoPedidosBean;



public interface DetallePedidoService {
	public Integer saveDetallePedido(DetallePedidoBean detallePedidoBean);//Create
	public DetallePedidoBean findDetallePedidoById(Integer idDetallePedidos);//Read
	public boolean updateDetallePedido(DetallePedidoBean detallePedidoBean);//Update
	public boolean deleteDetallePedido(Integer idDetallePedidos);//Delete
	public List<DetallePedidoBean> findAllDetallePedido();//ReadAll
	
	public List<DetallePedidoCantidadPeticionesBean> findCantidadPeticionesProducto();

	public GamaMasVendida findGamaMasVendida();//busca la gama mas vendida
	

	public List<PedidosProductoGamaAromaticasCaroBean> findProductoGAC();

	public List<DetallePedidoProdNoPedidosBean> ProductosNoPedidos();

}
