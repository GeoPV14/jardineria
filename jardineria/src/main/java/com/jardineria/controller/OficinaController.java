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

import com.jardineria.bean.OficinaBean;
import com.jardineria.service.OficinaService;

@RestController
@RequestMapping("/oficina")
public class OficinaController {

	@Autowired
	private OficinaService oficeService;
	@PostMapping("/save")
	public ResponseEntity<String> guardarOficina(@RequestBody OficinaBean oficinaBean){
		return new ResponseEntity<>(this.oficeService.saveOficina(oficinaBean), HttpStatus.OK);
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<OficinaBean>> findAll(){
		return new ResponseEntity<>(this.oficeService.mostrarOficina(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{IdOficina}")
	public ResponseEntity<Boolean> eliminarOficina(@PathVariable("IdOficina") String IdOficina){
		return new ResponseEntity<>(this.oficeService.deleteOficinaById(IdOficina), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{IdOficina}")
	public ResponseEntity<OficinaBean> buscarPorIdOficina(@PathVariable("IdOficina") String IdOficina){
		return new ResponseEntity<>(this.oficeService.findOficinaById(IdOficina), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarOficina(@RequestBody OficinaBean oficinaBean){
		return new ResponseEntity<>(this.oficeService.updateOficina(oficinaBean), HttpStatus.OK);
	}


}
