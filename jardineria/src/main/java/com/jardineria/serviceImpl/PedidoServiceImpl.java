package com.jardineria.serviceImpl;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.BuscaClientesConCompraEnMiami;
import com.jardineria.bean.ClienteConPedidos;
import com.jardineria.bean.ClientesPedidosMiami;
import com.jardineria.bean.CodigoPedidoBean;
import com.jardineria.bean.PedidoBean;
import com.jardineria.model.Clientes;
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

	@Override
	public Set<String> findAllStatusPedido() {
		List<Pedido> pedidoList = this.pedidoRepo.findAll();
		Set<String> estadoList = new HashSet<>();
		
		for(Pedido pedido : pedidoList) {
			estadoList.add(pedido.getEstado().toLowerCase());
		}
		
		return estadoList;
	}

	@Override
	public List<CodigoPedidoBean> findCodPed() {
		List<CodigoPedidoBean> codListInterface = this.pedidoRepo.findCodPed();
		
		return codListInterface;
	}

	@Override
	public List<ClientesPedidosMiami> findClientesConPagoDeMiami() {
		List<ClientesPedidosMiami> clientesMiamiList =  this.pedidoRepo.findClientesConPagoDeMiami();
	
		
		return clientesMiamiList;
	}

	@Override
	public List<ClienteConPedidos> findClientesAndPedido() {
		List<ClienteConPedidos> clientePEdidosList = this.pedidoRepo.findClientesAndPedido();
		return clientePEdidosList;
	}

}
