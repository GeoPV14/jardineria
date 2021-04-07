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

import com.jardineria.bean.ProductosBean;
import com.jardineria.service.ProductosService;

@RestController
@RequestMapping("/productos")
public class ProductosContoller {

	@Autowired 
	ProductosService productosService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<ProductosBean>> findAllProductos(){
		return new ResponseEntity<List<ProductosBean>>(this.productosService.mostrarProducto(),HttpStatus.OK);
	}
	
	@GetMapping("/finById/{id}")
	public ResponseEntity<ProductosBean> findByIdProducto(@PathVariable String id){
		return new ResponseEntity<>(this.productosService.findPedidoById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idProducto}")
	public ResponseEntity<Boolean> deleteProducto(@PathVariable String idProducto){
		return new ResponseEntity<Boolean>(this.productosService.deleteProductoById(idProducto),HttpStatus.OK);
	}
	
	@PutMapping("update")
	public ResponseEntity<Boolean> updateProducto(@RequestBody ProductosBean productoBean){
		return new ResponseEntity<Boolean>(this.productosService.updateProducto(productoBean),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProducto(@RequestBody ProductosBean productoBean){
		return new ResponseEntity<>(this.productosService.saveProducto(productoBean),HttpStatus.OK);
	}
}
