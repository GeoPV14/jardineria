package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jardineria.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, String>{

}
