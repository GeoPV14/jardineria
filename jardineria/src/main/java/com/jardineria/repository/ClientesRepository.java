package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.NomPedidoFechaBean;
import com.jardineria.bean.PagoClienteBean;
import com.jardineria.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, String>{

	@Query(value="SELECT * FROM jardineria.clientes where pais = 'USA'", nativeQuery = true)
	public List<Clientes> buscaClientesAmericanos();
	
	@Query(value="SELECT* FROM CLIENTES, EMPLEADOS WHERE CLIENTES.CODIGOEMPLEADOREPVENTAS = EMPLEADOS.CODIGOEMPLEADO", nativeQuery = true)
	public List<Clientes> buscaClientesConRep();
	
	@Query(value="SELECT * FROM CLIENTES, PAGOS WHERE CLIENTES.CODIGOCLIENTE = PAGOS.CODIGOCLIENTE AND PAGOS.FECHAPAGO LIKE '2007%' GROUP BY CLIENTES.NOMBRECLIENTE", nativeQuery = true)
	public List<Clientes> buscaClientesPago2007();
	
	@Query(value = "SELECT P.CODIGOPEDIDO AS CodPedido, C.NOMBRECLIENTE AS NombreCliente, P.FECHAENTREGA AS FechEntrega, P.FECHAESPERADA AS FechEsperada FROM CLIENTES C, PEDIDOS P WHERE C.CODIGOCLIENTE = P.CODIGOCLIENTE AND P.FECHAESPERADA < P.FECHAENTREGA", nativeQuery = true)
	List<NomPedidoFechaBean> mostrarFueraDeTiempo();
	
	@Query(value = "SELECT NOMBRECLIENTE AS NombreCliente, SUM(P.CANTIDAD) AS TotalPagado FROM CLIENTES C, PAGOS P WHERE C.CODIGOCLIENTE = P. CODIGOCLIENTE GROUP BY C.NOMBRECLIENTE", nativeQuery = true)
	List<PagoClienteBean> totalPagadoPorCliente();
}
