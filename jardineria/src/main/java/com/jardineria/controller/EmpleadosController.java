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

import com.jardineria.bean.BuscaTodosJefes;
import com.jardineria.bean.EmpleadoConJefe;
import com.jardineria.bean.EmpleadoNomApellBean;
import com.jardineria.bean.EmpleadosBean;
import com.jardineria.bean.EmpleadosCountBean;
import com.jardineria.bean.EmpleadosNyCBean;
import com.jardineria.service.EmpleadosService;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

	
	@Autowired
	private EmpleadosService empleadosService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> guardarEmpleados(@RequestBody EmpleadosBean empleadosBean){
		return new ResponseEntity<>(this.empleadosService.saveEmpleados(empleadosBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarEmpleado(@RequestBody EmpleadosBean empleadosBean){
		return new ResponseEntity<>(this.empleadosService.updateEmpleados(empleadosBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{codigoEmpleado}")
	public ResponseEntity<EmpleadosBean> buscarEmpleadoPorId(@PathVariable("codigoEmpleado") Integer codigoEmpleado){
		return new ResponseEntity<>(this.empleadosService.findEmpleadosById(codigoEmpleado), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{codigoEmpleado}")
	public ResponseEntity<Boolean> eliminarEmpleadoPorId(@PathVariable("codigoEmpleado") Integer codigoEmpleado){
		return new ResponseEntity<>(this.empleadosService.deleteEmpleados(codigoEmpleado), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<EmpleadosBean>> buscarTodo(){
		return new ResponseEntity<>(this.empleadosService.findAllEmpleados(),HttpStatus.OK);
	}
	
	@GetMapping("/findAllJefes")
	public ResponseEntity<List<BuscaTodosJefes>> BuscarTodosJefes(){
		return new ResponseEntity<>(this.empleadosService.findAllJefes(),HttpStatus.OK);
	}
	
	@GetMapping("/findAllSinDirOfi")
	public ResponseEntity<List<EmpleadosNyCBean>> mostrarNombreYCargoSinDirOfi(){
		return new ResponseEntity<>(this.empleadosService.findEmpNyC(), HttpStatus.OK);
	}
	
	@GetMapping("/countEmp")
	public ResponseEntity<EmpleadosCountBean> contarTotalEmpleados(){
		return new ResponseEntity<>(this.empleadosService.countEmp(), HttpStatus.OK);
	}
	

	@GetMapping("/emplConJefe")
	public ResponseEntity<List<EmpleadoConJefe>> findEmpleadosConJefe(){
		return new ResponseEntity<>(this.empleadosService.findEmpleadoConJefe(), HttpStatus.OK);}

	@GetMapping("/findEmplBarcelona") //Azta
	public ResponseEntity<List<EmpleadoNomApellBean>> mostrarEmplEnBarcelona(){
		return new ResponseEntity<>(this.empleadosService.findEmpleadosTrabajanBarcelona(), HttpStatus.OK);

	}

}
