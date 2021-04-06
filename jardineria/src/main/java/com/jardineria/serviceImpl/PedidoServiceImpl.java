package com.jardineria.serviceImpl;

<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
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
	
<<<<<<< HEAD
	//@Autowired
	//private PedidoRepository pedidoRepo;

	@Override
	public int savePedido(PedidoBean pedidoBean) {
		
		Pedido pedido = new Pedido();
		
=======
	@Autowired
	private PedidoRepository pedidoRepo;

	@Override
	public String savePedido(PedidoBean pedidoBean) {
		
		Pedido pedido = new Pedido();
		
		pedido.setCodPedido(pedidoBean.getCodPedido());
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
		pedido.setFechPedido(pedidoBean.getFechPedido());
		pedido.setFechEsperada(pedidoBean.getFechEsperada());
		pedido.setFechEntrega(pedidoBean.getFechEntrega());
		pedido.setEstado(pedidoBean.getEstado());
		pedido.setComentPedido(pedidoBean.getComentPedido());
		
<<<<<<< HEAD
		//pedidoRepo.save(pedido);
=======
		pedidoRepo.save(pedido);
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
		
		return pedido.getCodPedido();
	}

	@Override
	public boolean updatePedido(PedidoBean pedidoBean) {
		
<<<<<<< HEAD
=======
		Date date = new Date();
		
		Pedido p = new Pedido();
		
		p.setFechPedido(date);
		
		
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
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
