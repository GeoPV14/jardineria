package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.CodigoPedidoBean;
import com.jardineria.model.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, String>{
	
	@Query(value = "SELECT PE.CODIGOPEDIDO AS CodPedido FROM PEDIDOS PE WHERE (SELECT SUM(DP.CANTIDAD * DP.PRECIOUNIDAD) AS TOTAL FROM PEDIDOS P, DETALLEPEDIDOS DP WHERE P.CODIGOPEDIDO = DP.COD_PEDIDO AND PE.CODIGOPEDIDO = P.CODIGOPEDIDO GROUP BY P.CODIGOPEDIDO)\r\n"
			+ ">\r\n"
			+ "(SELECT AVG(T.TOTAL) FROM (SELECT P.CODIGOPEDIDO, SUM(DP.CANTIDAD * DP.PRECIOUNIDAD) AS TOTAL FROM PEDIDOS P, DETALLEPEDIDOS DP WHERE P.CODIGOPEDIDO = DP.COD_PEDIDO GROUP BY P.CODIGOPEDIDO) T)", nativeQuery = true)
	List<CodigoPedidoBean> findCodPed();
}
