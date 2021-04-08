package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.CodigoPedidoBean;
import com.jardineria.model.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, String>{
	
	@Query(value = "select pe.codigopedido as CodPedido\r\n"
			+ "from pedidos pe\r\n"
			+ "where\r\n"
			+ "(select sum(dp.cantidad * dp.PRECIOUNIDAD) as total\r\n"
			+ "      from pedidos p, detallepedidos dp\r\n"
			+ "      where p.codigopedido = dp.cod_pedido and pe.codigopedido = p.codigopedido\r\n"
			+ "      group by p.codigopedido)\r\n"
			+ ">\r\n"
			+ "(select avg(t.total)\r\n"
			+ "from (select p.codigopedido, sum(dp.cantidad * dp.preciounidad) as total\r\n"
			+ "      from pedidos p, detallepedidos dp\r\n"
			+ "      where p.codigopedido = dp.cod_pedido\r\n"
			+ "      group by p.codigopedido) t);", nativeQuery = true)
	List<CodigoPedidoBean> findCodPed();


}
