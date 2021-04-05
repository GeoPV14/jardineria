package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Pagos;

@Repository
public interface PagosRespository extends JpaRepository<Pagos, String>{

}
