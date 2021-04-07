package com.jardineria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardineria.bean.PedidoBean;
import com.jardineria.service.PedidoService;

@RequestMapping(name = "/pedido")
@RestController
public class PedidoController {
/*	
	@Autowired
	private PedidoService pedidoService;
	
	@PostMapping(name = "/save")
	public ResponseEntity<Integer> guardarPedido(@RequestBody PedidoBean pedidoBean){
		return new ResponseEntity<>(this.pedidoService.savePedido(pedidoBean), HttpStatus.OK);
	}
*/	

}
