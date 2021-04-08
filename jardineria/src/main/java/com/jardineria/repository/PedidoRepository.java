package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.BuscaClientesConCompraEnMiami;
import com.jardineria.bean.ClienteConPedidos;
import com.jardineria.bean.ClientesPedidosMiami;
import com.jardineria.bean.CodigoPedidoBean;
import com.jardineria.bean.PedidoFinalPriceBean;
import com.jardineria.model.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, String>{
	
	@Query(value = "SELECT PE.CODIGOPEDIDO AS CodPedido FROM PEDIDOS PE WHERE (SELECT SUM(DP.CANTIDAD * DP.PRECIOUNIDAD) AS TOTAL FROM PEDIDOS P, DETALLEPEDIDOS DP WHERE P.CODIGOPEDIDO = DP.COD_PEDIDO AND PE.CODIGOPEDIDO = P.CODIGOPEDIDO GROUP BY P.CODIGOPEDIDO)\r\n"
			+ ">\r\n"
			+ "(SELECT AVG(T.TOTAL) FROM (SELECT P.CODIGOPEDIDO, SUM(DP.CANTIDAD * DP.PRECIOUNIDAD) AS TOTAL FROM PEDIDOS P, DETALLEPEDIDOS DP WHERE P.CODIGOPEDIDO = DP.COD_PEDIDO GROUP BY P.CODIGOPEDIDO) T)", nativeQuery = true)
	List<CodigoPedidoBean> findCodPed();
	

	@Query(value="SELECT  distinct clientes.NOMBRECLIENTE, clientes.APELLIDOCONTACTO FROM jardineria.pedidos \r\n"
			+ "inner join jardineria.clientes\r\n"
			+ "on clientes.CODIGOCLIENTE=pedidos.CODIGOCLIENTE\r\n"
			+ "where clientes.CIUDAD=\"Miami\" order by clientes.CODIGOCLIENTE",nativeQuery = true)
	public List<ClientesPedidosMiami> findClientesConPagoDeMiami();
	
	@Query(value="select  p.codigopedido, \r\n"
			+ "        p.fechapedido, \r\n"
			+ "        p.fechaesperada, \r\n"
			+ "        p.fechaentrega,\r\n"
			+ "        c.nombrecliente\r\n"
			+ "from pedidos p, clientes c\r\n"
			+ "where p.CODIGOCLIENTE = c.CODIGOCLIENTE", nativeQuery = true)
	public List<ClienteConPedidos> findClientesAndPedido();


	@Query(value = "select pe.codigopedido as CodPedido from pedidos pe, detallepedidos dp\r\n"
			+ "where pe.codigopedido = dp.cod_pedido\r\n"
			+ "group by pe.codigopedido\r\n"
			+ "having count(*)>=6;", nativeQuery = true)
	List<CodigoPedidoBean> mostrarCodPedMay6();
	
	@Query(value = "select p.codigopedido as CodProducto, sum(dp.cantidad * dp.PRECIOUNIDAD) as total"
			+ " from pedidos p, detallepedidos dp"
			+ " where p.codigopedido = dp.cod_pedido"
			+ " group by p.codigopedido;", nativeQuery = true)
	List<PedidoFinalPriceBean> precioFinalProducto();


}
