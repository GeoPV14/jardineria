package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.ClientesBean;
import com.jardineria.model.Clientes;
import com.jardineria.repository.ClientesRepository;
import com.jardineria.service.ClientesService;

@Service
@Transactional
public class ClientesServiceImpl implements ClientesService{
	
	@Autowired
	private ClientesRepository clientesRepo;

	@Override
	public boolean saveCliente(ClientesBean clienteBean) {
		
		Clientes cliente = new Clientes();
		BeanUtils.copyProperties(clienteBean, cliente);
		this.clientesRepo.save(cliente);
		
		return true;
	}

	@Override
	public ClientesBean findByIdClientes(String id) {
		
		Clientes cliente = this.clientesRepo.findById(id).orElseThrow();
		ClientesBean clienteBean = new ClientesBean();
		BeanUtils.copyProperties(cliente, clienteBean);
		
		return clienteBean;
	}

	@Override
	public List<ClientesBean> findAllClientes() {
		
		List<Clientes> clientesList = this.clientesRepo.findAll();
		List<ClientesBean> clientesBeanList = new ArrayList<>();
		
		for(Clientes cliente : clientesList) {
			ClientesBean clienteBean = new ClientesBean();
			BeanUtils.copyProperties(cliente, clienteBean);
			clientesBeanList.add(clienteBean);
		}
		
		return clientesBeanList;
	}

	@Override
	public boolean updateCliente(ClientesBean clienteBean) {
		Clientes cliente = this.clientesRepo.findById(clienteBean.getCodigoCliente()).orElseThrow();
		BeanUtils.copyProperties(clienteBean, cliente);
		this.clientesRepo.save(cliente);
		return true;
	}

	@Override
	public boolean deleteCliente(String id) {
		Clientes cliente = this.clientesRepo.findById(id).orElseThrow();
		this.clientesRepo.delete(cliente);
		return true;
	}

	@Override
	public List<ClientesBean> findClientesUSA() {
		List<Clientes> clientesList = this.clientesRepo.buscaClientesAmericanos();
		List<ClientesBean> clientesBeanList = new ArrayList<>();
		
		for(Clientes cliente : clientesList) {
			ClientesBean clienteBean = new ClientesBean();
			BeanUtils.copyProperties(cliente, clienteBean);
			clientesBeanList.add(clienteBean);
		}
		
		return clientesBeanList;
	}

}
