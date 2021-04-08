package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.DetallePedidoCantidadPeticionesBean;
import com.jardineria.bean.GamaMasVendida;
import com.jardineria.bean.DetallePedidoProdNoPedidosBean;
import com.jardineria.model.DetallePedido;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Integer>{
	@Query(value = "SELECT CODIGO_PRODUCTO AS codigoProducto, COUNT(*) AS cantidad FROM DETALLEPEDIDOS GROUP BY CODIGO_PRODUCTO", nativeQuery = true)
	public List<DetallePedidoCantidadPeticionesBean> buscaCantidadPeticionesProductos();
	

	@Query(value="select p.codigogama, sum(dp.cantidad) as cantidad  from detallepedidos dp, productos p where p.codigoproducto = dp.codigo_producto group by p.codigogama order by cantidad desc limit 1",nativeQuery = true)
	public GamaMasVendida findGamaMasVendido();

	@Query(value = "select p.codigoproducto as CodProduct, p.nombre as NomProduct, p.codigogama as CodGama \r\n"
			+ "from productos p, GAMASPRODUCTOS g where p.codigogama = g.codigogama and not exists (select CODIGO_PRODUCTO from detallepedidos where codigo_producto=p.CODIGOPRODUCTO);", nativeQuery = true)
	public List<DetallePedidoProdNoPedidosBean> productosNuncaPedidos();

}
