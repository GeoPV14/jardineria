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
	
	@Query(value="SELECT* FROM CLIENTES, EMPLEADOS WHERE CLIENTES.CODIGOEMPLEADOREPVENTAS = EMPLEADOS.CODIGOEMPLEADO", nativeQuery = true)
	public List<Clientes> buscaClientesConRep();
	
	@Query(value="SELECT * FROM CLIENTES, PAGOS WHERE CLIENTES.CODIGOCLIENTE = PAGOS.CODIGOCLIENTE AND PAGOS.FECHAPAGO LIKE '2007%' GROUP BY CLIENTES.NOMBRECLIENTE", nativeQuery = true)
	public List<Clientes> buscaClientesPago2007();

}
