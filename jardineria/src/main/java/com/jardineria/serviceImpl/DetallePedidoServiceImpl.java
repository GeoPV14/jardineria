package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.DetallePedidoBean;
import com.jardineria.bean.DetallePedidoCantidadPeticionesBean;

import com.jardineria.bean.GamaMasVendida;

import com.jardineria.bean.PedidosProductoGamaAromaticasCaroBean;
import com.jardineria.bean.DetallePedidoProdNoPedidosBean;

import com.jardineria.model.DetallePedido;
import com.jardineria.model.Productos;
import com.jardineria.repository.DetallePedidoRepository;
import com.jardineria.repository.ProductosRepository;
import com.jardineria.service.DetallePedidoService;

@Service
@Transactional
public class DetallePedidoServiceImpl implements DetallePedidoService{
	
	@Autowired
	DetallePedidoRepository detallePedidoRepo;
	
	@Autowired
	private ProductosRepository productoRepo;

	@Override
	public Integer saveDetallePedido(DetallePedidoBean detallePedidoBean) {
		DetallePedido detallePedido = new DetallePedido();
		
		detallePedido.setCantidad(detallePedidoBean.getCantidad());
		detallePedido.setPrecioUnidad(detallePedidoBean.getPrecioUnidad());
		detallePedido.setNumeroLinea(detallePedidoBean.getNumeroLinea());
		
		this.detallePedidoRepo.save(detallePedido);
		
		return detallePedido.getIdDetallePedidos();
	}

	@Override
	public DetallePedidoBean findDetallePedidoById(Integer idDetallePedidos) {
		DetallePedido detallePedido = this.detallePedidoRepo.findById(idDetallePedidos).orElseThrow();
		DetallePedidoBean detallePedidoBean = new DetallePedidoBean();
		
		BeanUtils.copyProperties(detallePedido, detallePedidoBean);
		
		return detallePedidoBean;
	}

	@Override
	public boolean updateDetallePedido(DetallePedidoBean detallePedidoBean) {
		DetallePedido detallePedido = this.detallePedidoRepo.findById(detallePedidoBean.getIdDetallePedidos()).orElseThrow();
		
		BeanUtils.copyProperties(detallePedidoBean, detallePedido);
		
		this.detallePedidoRepo.save(detallePedido);
		
		return true;
	}

	@Override
	public boolean deleteDetallePedido(Integer idDetallePedidos) {
		DetallePedido detallePedido = this.detallePedidoRepo.findById(idDetallePedidos).orElseThrow();
		
		this.detallePedidoRepo.delete(detallePedido);
		
		return true;
	}

	@Override
	public List<DetallePedidoBean> findAllDetallePedido() {
		List<DetallePedido> detallePedidoList = this.detallePedidoRepo.findAll();
		List<DetallePedidoBean> detallePedidoBeanList = new ArrayList<>();
		
		for(DetallePedido detallePedido : detallePedidoList) {
			DetallePedidoBean detallePedidoBean = new DetallePedidoBean();
			
			BeanUtils.copyProperties(detallePedido, detallePedidoBean);
			detallePedidoBeanList.add(detallePedidoBean);
			
		}
		
		return detallePedidoBeanList;
	}

	@Override
	public List<DetallePedidoCantidadPeticionesBean> findCantidadPeticionesProducto() {
		List<DetallePedidoCantidadPeticionesBean> dPCPBeanList = this.detallePedidoRepo.buscaCantidadPeticionesProductos();
		
		return dPCPBeanList;
	}
	
	@Override
	public List<PedidosProductoGamaAromaticasCaroBean> findProductoGAC() {
		List<DetallePedido> detallePedidoList = this.detallePedidoRepo.findAll();
		List<Productos> productoList = this.productoRepo.findAll();
		List<String> codigoProductoList = new ArrayList<>();
		Set<String> codigoPedidoList = new HashSet<>();
		
		List<PedidosProductoGamaAromaticasCaroBean> pedidosPGACList = new ArrayList<>();
		double maxPrecio = 0;
		
		for(Productos producto : productoList) {
			if(producto.getGamaProducto().getGama().equals("Aromáticas") && producto.getPrecioVenta() > maxPrecio) {
				codigoProductoList.clear();
				for(Productos producto1 : productoList) {
					codigoProductoList.add(producto1.getCodigoProducto());
				}
				maxPrecio = producto.getPrecioVenta();
			}
		}
		for(DetallePedido detallePedido : detallePedidoList) {
			for(String codigoProducto : codigoProductoList) {
				if(detallePedido.getProducto().getCodigoProducto().equals(codigoProducto)) {
					codigoPedidoList.add(detallePedido.getPedido().getCodPedido());
				}
				
			}
		}
		for(String codigoPedido : codigoPedidoList) {
			PedidosProductoGamaAromaticasCaroBean pedidosPGAC = new PedidosProductoGamaAromaticasCaroBean();
			pedidosPGAC.setCodPedido(codigoPedido);
			pedidosPGACList.add(pedidosPGAC);
		}

		return pedidosPGACList;
	}

	@Override
	public List<DetallePedidoProdNoPedidosBean> ProductosNoPedidos() {
		List<DetallePedidoProdNoPedidosBean> productNoPedidosBean = this.detallePedidoRepo.productosNuncaPedidos();
		return productNoPedidosBean;
	}

	@Override
	public GamaMasVendida findGamaMasVendida() {
		GamaMasVendida gama= this.detallePedidoRepo.findGamaMasVendido();
		return gama;
	}

}
