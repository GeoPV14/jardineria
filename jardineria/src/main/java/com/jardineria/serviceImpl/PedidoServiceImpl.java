package com.jardineria.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.PedidoBean;
import com.jardineria.model.Pedido;
import com.jardineria.repository.PedidoRepository;
import com.jardineria.service.PedidoService;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	private PedidoRepository pedidoRepo;

	@Override
	public String savePedido(PedidoBean pedidoBean) {
		
		Pedido pedido = new Pedido();
		
		pedido.setCodPedido(pedidoBean.getCodPedido());
		pedido.setFechPedido(pedidoBean.getFechPedido());
		pedido.setFechEsperada(pedidoBean.getFechEsperada());
		pedido.setFechEntrega(pedidoBean.getFechEntrega());
		pedido.setEstado(pedidoBean.getEstado());
		pedido.setComentPedido(pedidoBean.getComentPedido());
		
		pedidoRepo.save(pedido);
		
		return pedido.getCodPedido();
	}

	@Override
	public boolean updatePedido(PedidoBean pedidoBean) {
		
		Date date = new Date();
		
		Pedido p = new Pedido();
		
		p.setFechPedido(date);
		
		
		return false;
	}

	@Override
	public PedidoBean findPedidoById(String idPedido) {
		
		return null;
	}

	@Override
	public List<PedidoBean> mostrarPedido() {
		
		return null;
	}

	@Override
	public boolean deletePedidoById(String idPedido) {
		
		return false;
	}
	

}
