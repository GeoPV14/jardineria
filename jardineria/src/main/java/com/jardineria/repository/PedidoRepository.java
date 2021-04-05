package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, String>{

}
