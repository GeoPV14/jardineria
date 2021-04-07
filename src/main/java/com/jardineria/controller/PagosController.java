package com.jardineria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardineria.bean.PagosBean;
import com.jardineria.service.PagosService;

@RestController
@RequestMapping("/pagos")
public class PagosController {

	
	@Autowired
	PagosService pagosService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PagosBean>> findAllPagos(){
		return new ResponseEntity<>(this.pagosService.mostrarPagos(),HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idPago}")
	public ResponseEntity<PagosBean> findPagopById(@PathVariable String idPago){
		return new ResponseEntity<PagosBean>(this.pagosService.findOPagosById(idPago),HttpStatus.OK);
	}
	
	@DeleteMapping("/deletePago/{idPago}")
	public ResponseEntity<Boolean> deletePAgo(@PathVariable String idPago){
		return new ResponseEntity<>(this.pagosService.deletePagosById(idPago),HttpStatus.OK);
	}
	
	@PutMapping("/updatePago")
	public ResponseEntity<Boolean> updatePago(@RequestBody PagosBean pago){
		return new ResponseEntity<Boolean>(this.pagosService.updatePagos(pago),HttpStatus.OK);
	}
	
	@PutMapping("/savePago")
	public ResponseEntity<String> savePago(@RequestBody PagosBean pagoBean){
		return new ResponseEntity<String>(this.pagosService.savePagos(pagoBean),HttpStatus.OK);
	}
	
	
}
