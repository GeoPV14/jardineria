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

import com.jardineria.bean.DetallePedidoBean;
import com.jardineria.bean.DetallePedidoCantidadPeticionesBean;
import com.jardineria.bean.DetallePedidoProdNoPedidosBean;
import com.jardineria.service.DetallePedidoService;

@RestController
@RequestMapping("/detallePedido")
public class DetallePedidoController {
	
	@Autowired
	private DetallePedidoService detallePedidoService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> guardarDetallePedido(@RequestBody DetallePedidoBean detallePedidoBean){
		return new ResponseEntity<>(this.detallePedidoService.saveDetallePedido(detallePedidoBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarDetallePedido(@RequestBody DetallePedidoBean detallePedidoBean){
		return new ResponseEntity<>(this.detallePedidoService.updateDetallePedido(detallePedidoBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idDetallePedidos}")
	public ResponseEntity<DetallePedidoBean> buscarEmpleadoPorId(@PathVariable("idDetallePedidos") Integer idDetallePedidos){
		return new ResponseEntity<>(this.detallePedidoService.findDetallePedidoById(idDetallePedidos), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idDetallePedidos}")
	public ResponseEntity<Boolean> eliminarDetallePedidoPorId(@PathVariable("idDetallePedidos") Integer idDetallePedidos){
		return new ResponseEntity<>(this.detallePedidoService.deleteDetallePedido(idDetallePedidos), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<DetallePedidoBean>> BuscarTodo(){
		return new ResponseEntity<>(this.detallePedidoService.findAllDetallePedido(),HttpStatus.OK);
	}
	
	@GetMapping("/findAllCodigoCantidad")
	public ResponseEntity<List<DetallePedidoCantidadPeticionesBean>> BuscarTodoCodigoCantidad(){
		return new ResponseEntity<>(this.detallePedidoService.findCantidadPeticionesProducto(),HttpStatus.OK);
	}
	
	@GetMapping("/findProdNoSolicitados") //Azta
	public ResponseEntity<List<DetallePedidoProdNoPedidosBean>> mostrarProductosNoPedidos(){
		return new ResponseEntity<>(this.detallePedidoService.ProductosNoPedidos(), HttpStatus.OK);
	}
}
