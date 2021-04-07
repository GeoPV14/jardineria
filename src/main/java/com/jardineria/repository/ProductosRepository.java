package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, String> {

}
