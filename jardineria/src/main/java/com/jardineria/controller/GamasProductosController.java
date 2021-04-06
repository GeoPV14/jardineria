package com.jardineria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
import org.springframework.web.bind.annotation.RestController;

import com.jardineria.bean.GamasProductosBean;
import com.jardineria.service.GamasProductosService;

<<<<<<< HEAD
@Controller
@RestController("/gamaProducto")
=======
@RestController
@RequestMapping("/gamaProducto")
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807
public class GamasProductosController {
	@Autowired
	private GamasProductosService gamaProductoService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarGamaProducto(@RequestBody GamasProductosBean gamaproductoBean){
		return new ResponseEntity<>(this.gamaProductoService.saveGamaProducto(gamaproductoBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<GamasProductosBean> mostrarGamaProducto(@PathVariable Integer id){
		return new ResponseEntity<>(this.gamaProductoService.findByIdGamaProducto(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<GamasProductosBean>> mostrarGamasProductos(){
		return new ResponseEntity<>(this.gamaProductoService.findAllGamasProductos(),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarGamaProducto(@RequestBody GamasProductosBean gamaProductoBean){
		return new ResponseEntity<>(this.gamaProductoService.updateGamaProducto(gamaProductoBean),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarGamaProducto(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.gamaProductoService.deleteGamaProducto(id), HttpStatus.OK);
	}
}
