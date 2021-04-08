package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.ClienteRepBean;
import com.jardineria.bean.ClientesBean;
import com.jardineria.bean.ClientesPaisBean;
import com.jardineria.bean.NomPedidoFechaBean;
import com.jardineria.bean.PagoClienteBean;

public interface ClientesService {
	
	public boolean saveCliente(ClientesBean clienteBean);
	public ClientesBean findByIdClientes(String id);
	public List<ClientesBean> findAllClientes();
	public boolean updateCliente(ClientesBean clienteBean);
	public boolean deleteCliente(String id);

	public List<ClientesBean> findClientesUSA();//busca clientes americanos
	

	public List<ClienteRepBean> findClientesWithRep();
	public List<String> findClientesPay2007();

	public List<ClientesPaisBean> findClientesPorPais();
	
	public List<NomPedidoFechaBean> mostrarFueraDeTiempo();//Mostrar pedidos fuera de tiempo
	public List<PagoClienteBean> totalPagadoPorCliente();//Mostrar el total pagado por cliente

}
