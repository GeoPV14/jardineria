package com.jardineria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardineria.bean.OficinaBean;
import com.jardineria.service.OficinaService;

@RequestMapping(name = "/oficina")
@RestController
public class OficinaController {
	
	@Autowired
	private OficinaService oficeService;
	
	@PostMapping(name = "/save")
	public ResponseEntity<String> guardarOficina(@RequestBody OficinaBean oficinaBean){
		return new ResponseEntity<>(this.oficeService.saveOficina(oficinaBean), HttpStatus.OK);
	}

}
