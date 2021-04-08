package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.EmpleadoConJefe;
import com.jardineria.model.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{
	
	@Query(value="select * \r\n"
			+ "from empleados \r\n"
			+ "where codigojefe is null",nativeQuery = true)
	public List<Empleados> findAllAEmpleados();
	
	@Query(value="SELECT e.NOMBRE empleadoNombre, e.APELLIDO1 EmpleadoApellidoM, e.APELLIDO2 EmpleadoApellidoP, \r\n"
			+ "e.CODIGOOFICINA EmpleadoCodigoOficina, ej.NOMBRE JefeNombre, ej.APELLIDO1 JefeApellidoM, ej.APELLIDO2 JefeApellidoP, \r\n"
			+ "ej.CODIGOOFICINA JefeCodigoOficina \r\n"
			+ "FROM empleados e\r\n"
			+ "inner join empleados ej\r\n"
			+ "on e.CODIGOEMPLEADO=ej.CODIGOJEFE", nativeQuery = true)
	public List<EmpleadoConJefe> findEmpleadoConJefe();
}
