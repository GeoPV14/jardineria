package com.jardineria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardineria.bean.ClienteRepBean;
import com.jardineria.bean.ClientesBean;
import com.jardineria.bean.ClientesPaisBean;
import com.jardineria.bean.NomPedidoFechaBean;
import com.jardineria.service.ClientesService;


@RestController
@RequestMapping("/clientes")

public class ClientesController {
	@Autowired
	private ClientesService clientesService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarCliente(@RequestBody ClientesBean clienteBean){
		return new ResponseEntity<>(this.clientesService.saveCliente(clienteBean),HttpStatus.OK);
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<ClientesBean> mostrarCliente(@PathVariable("id") String id){
		return new ResponseEntity<>(this.clientesService.findByIdClientes(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<ClientesBean>> mostrarClientes(){
		return new ResponseEntity<>(this.clientesService.findAllClientes(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarCliente(@RequestBody ClientesBean clienteBean){
		return new ResponseEntity<>(this.clientesService.updateCliente(clienteBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarCliente(@PathVariable("id") String id){
		return new ResponseEntity<>(this.clientesService.deleteCliente(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAllUsa")
	public ResponseEntity<List<ClientesBean>> mostrarClientesUSA(){
		return new ResponseEntity<>(this.clientesService.findClientesUSA(), HttpStatus.OK);
	}
	

	@GetMapping("/findAllClientesWithRep") //Clientes con sus representantes de ventas(Empleados)
	public ResponseEntity<List<ClienteRepBean>> mostrarClientesConRep(){
		return new ResponseEntity<>(this.clientesService.findClientesWithRep(), HttpStatus.OK);
	}
	
	@GetMapping("/findAllClientesPay2007") //Clientes con pagos en 2007
	public ResponseEntity<List<String>> mostrarClientesConPagos2007(){
		return new ResponseEntity<>(this.clientesService.findClientesPay2007(), HttpStatus.OK);
	}

	
	@GetMapping("/findClientesPorPais")
	public ResponseEntity<List<ClientesPaisBean>> clientesPorPais(){
		return new ResponseEntity<>(this.clientesService.findClientesPorPais(), HttpStatus.OK);
	}
	
	@GetMapping("/outTime")
	public ResponseEntity<List<NomPedidoFechaBean>> pedidosFueraDeTiempo(){
		return new ResponseEntity<>(this.clientesService.mostrarFueraDeTiempo(), HttpStatus.OK);
	}
}
