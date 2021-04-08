package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.ClienteRepBean;
import com.jardineria.bean.ClientesBean;
import com.jardineria.bean.ClientesPaisBean;
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

	@Override
	public List<ClienteRepBean> findClientesWithRep() {
		List<Clientes> clienteList = this.clientesRepo.buscaClientesConRep();
		List<ClienteRepBean> clienteRepBeanList = new ArrayList<>();
		
		for(Clientes cliente : clienteList) {
			ClienteRepBean clienteRep = new ClienteRepBean();
			clienteRep.setNombreCliente(cliente.getNombreCliente());
			clienteRep.setNombreRepEmp(cliente.getEmpleado().getNombre());
			clienteRepBeanList.add(clienteRep);
		}
		
		return clienteRepBeanList;
	}

	@Override
	public List<String> findClientesPay2007() {
		List<Clientes> clienteList = this.clientesRepo.buscaClientesPago2007();
		List<String> nombreList = new ArrayList<>();
		
		for(Clientes cliente : clienteList) {
			nombreList.add(cliente.getNombreCliente());
		}
		
		return nombreList;
	}	
	
	public List<ClientesPaisBean> findClientesPorPais() {
		
		List<Clientes> clientesList = this.clientesRepo.findAll();
		List<ClientesPaisBean> clientesPaisBeanList = new ArrayList<>();
		
		ClientesPaisBean clienteMX = new ClientesPaisBean("MX", 0);
		ClientesPaisBean clienteUSA = new ClientesPaisBean("USA", 0);
		ClientesPaisBean clienteESP = new ClientesPaisBean("ESP", 0);
		ClientesPaisBean clienteFRN = new ClientesPaisBean("FRAN", 0);
		ClientesPaisBean clienteAUS = new ClientesPaisBean("AUS", 0);
		ClientesPaisBean clienteUK = new ClientesPaisBean("UK", 0);
		
		int mx = 0, usa = 0, esp = 0, frn = 0, aus = 0, uk = 0;
		
		for(Clientes clientes : clientesList) {
			if(clientes.getPais().equals("Mexico")) {
				mx += 1;
			}else if(clientes.getPais().equals("USA")) {
				usa += 1;
			}else if(clientes.getPais().equals("España") || clientes.getPais().equals("Spain")) {
				esp += 1;
			}else if(clientes.getPais().equals("France")) {
				frn += 1;
			}else if(clientes.getPais().equals("Australia")) {
				aus += 1;
			}else if(clientes.getPais().equals("United Kingdom")) {
				uk += 1;
			}//EndIfs	
		}//EndFors
		
		clienteMX.setCountClient(mx);
		clienteUSA.setCountClient(usa);
		clienteESP.setCountClient(esp);
		clienteFRN.setCountClient(frn);
		clienteAUS.setCountClient(aus);
		clienteUK.setCountClient(uk);
		
		clientesPaisBeanList.add(clienteUK);
		clientesPaisBeanList.add(clienteAUS);
		clientesPaisBeanList.add(clienteFRN);
		clientesPaisBeanList.add(clienteESP);
		clientesPaisBeanList.add(clienteUSA);
		clientesPaisBeanList.add(clienteMX);
		
		return clientesPaisBeanList;
	}

}
