package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.DetallePedidoBean;
import com.jardineria.bean.DetallePedidoCantidadPeticionesBean;
import com.jardineria.model.DetallePedido;
import com.jardineria.repository.DetallePedidoRepository;
import com.jardineria.service.DetallePedidoService;

@Service
@Transactional
public class DetallePedidoServiceImpl implements DetallePedidoService{
	
	@Autowired
	DetallePedidoRepository detallePedidoRepo;

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

}
