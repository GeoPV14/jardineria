package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{

}
