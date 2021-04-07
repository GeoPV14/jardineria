package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, String>{

	@Query(value="SELECT * FROM jardineria.clientes where pais = 'USA'", nativeQuery = true)
	public List<Clientes> buscaClientesAmericanos();
	
}
