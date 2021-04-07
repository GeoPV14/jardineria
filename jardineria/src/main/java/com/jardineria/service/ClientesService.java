package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.ClientesBean;
import com.jardineria.model.Clientes;

public interface ClientesService {
	
	public boolean saveCliente(ClientesBean clienteBean);
	public ClientesBean findByIdClientes(String id);
	public List<ClientesBean> findAllClientes();
	public boolean updateCliente(ClientesBean clienteBean);
	public boolean deleteCliente(String id);

	public List<ClientesBean> findClientesUSA();//busca clientes americanos
}
