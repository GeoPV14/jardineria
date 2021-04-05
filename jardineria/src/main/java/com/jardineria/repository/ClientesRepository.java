package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, String>{

}
