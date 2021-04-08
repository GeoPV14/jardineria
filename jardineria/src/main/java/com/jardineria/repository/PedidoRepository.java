package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.BuscaClientesConCompraEnMiami;
import com.jardineria.bean.ClienteConPedidos;
import com.jardineria.bean.ClientesPedidosMiami;
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


}
