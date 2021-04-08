package com.jardineria.controller;

import java.util.List;
import java.util.Set;

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

import com.jardineria.bean.PedidoBean;
import com.jardineria.service.PedidoService;

@RequestMapping("/pedido")
@RestController
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@PostMapping("/save")
	public ResponseEntity<String> guardarPedido(@RequestBody PedidoBean pedidoBean){
		return new ResponseEntity<>(this.pedidoService.savePedido(pedidoBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarPedidos(@RequestBody PedidoBean pedidoBean){
		return new ResponseEntity<>(this.pedidoService.updatePedido(pedidoBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{IdPedido}")
	public ResponseEntity<PedidoBean> encontrarPedidoPorId(@PathVariable("IdPedido") String IdPedido){
		return new ResponseEntity<>(this.pedidoService.findPedidoById(IdPedido), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PedidoBean>> findAll(){
		return new ResponseEntity<>(this.pedidoService.mostrarPedido(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{IdPedido}")
	public ResponseEntity<Boolean> eliminarPedido(@PathVariable("IdPedido") String IdPedido){
		return new ResponseEntity<>(this.pedidoService.deletePedidoById(IdPedido), HttpStatus.OK);
	}
	
	@GetMapping("/findAllStatusPedidos") //Estados posibles de los pedidos
	public ResponseEntity<Set<String>> findAllStatusPedidos(){
		return new ResponseEntity<>(this.pedidoService.findAllStatusPedido(),HttpStatus.OK);
	}

}
