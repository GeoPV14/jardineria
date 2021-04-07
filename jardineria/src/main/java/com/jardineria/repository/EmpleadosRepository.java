package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{
	
	@Query(value="select * \r\n"
			+ "from empleados \r\n"
			+ "where codigojefe is null",nativeQuery = true)
	public List<Empleados> findAllAEmpleados();
}
