package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.GamasProductos;

@Repository
public interface GamasProductosRepository extends JpaRepository<GamasProductos, Integer>{

}
