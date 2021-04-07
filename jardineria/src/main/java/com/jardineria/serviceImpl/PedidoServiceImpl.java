package com.jardineria.serviceImpl;


import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
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
		Date date = new Date();
		
		pedido.setCodPedido(pedidoBean.getCodPedido());
		pedido.setFechPedido(date);
		pedido.setFechEsperada(pedidoBean.getFechEsperada());
		pedido.setFechEntrega(pedidoBean.getFechEntrega());
		pedido.setEstado(pedidoBean.getEstado());
		pedido.setComentPedido(pedidoBean.getComentPedido());
		

		this.pedidoRepo.save(pedido);
		
		return pedido.getCodPedido();
	}

	@Override
	public boolean updatePedido(PedidoBean pedidoBean) {
		Pedido pedido = this.pedidoRepo.findById(pedidoBean.getCodPedido()).orElseThrow();
		Date date = new Date();
		
		pedido.setFechPedido(date);
		pedido.setFechEsperada(pedidoBean.getFechEsperada());
		pedido.setFechEntrega(pedidoBean.getFechEntrega());
		pedido.setEstado(pedidoBean.getEstado());
		pedido.setComentPedido(pedidoBean.getComentPedido());
		
		this.pedidoRepo.save(pedido);

		return true;
	}

	@Override
	public PedidoBean findPedidoById(String idPedido) {
		
		Pedido pedido = this.pedidoRepo.findById(idPedido).orElseThrow();
		PedidoBean pedidoBean = new PedidoBean();
		
		BeanUtils.copyProperties(pedido, pedidoBean);
		
		return pedidoBean;
	}

	@Override
	public List<PedidoBean> mostrarPedido() {
		List<Pedido> pedidoList = this.pedidoRepo.findAll();
		List<PedidoBean> pedidoBeanList = new ArrayList<>();
		
		for(Pedido pedido: pedidoList) {
			PedidoBean pedidoBean = new PedidoBean();
			BeanUtils.copyProperties(pedido, pedidoBean);
			pedidoBeanList.add(pedidoBean);
		}
		
		return pedidoBeanList;
	}

	@Override
	public boolean deletePedidoById(String idPedido) {
		
		Pedido pedido = this.pedidoRepo.findById(idPedido).orElseThrow();
		this.pedidoRepo.delete(pedido);
		
		return true;
	}

}
