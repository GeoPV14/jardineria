package com.jardineria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Oficina;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, String> {

}
