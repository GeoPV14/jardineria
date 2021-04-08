package com.jardineria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jardineria.bean.DetallePedidoCantidadPeticionesBean;
import com.jardineria.bean.GamaMasVendida;
import com.jardineria.model.DetallePedido;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Integer>{
	@Query(value = "SELECT CODIGO_PRODUCTO AS codigoProducto, COUNT(*) AS cantidad FROM DETALLEPEDIDOS GROUP BY CODIGO_PRODUCTO", nativeQuery = true)
	public List<DetallePedidoCantidadPeticionesBean> buscaCantidadPeticionesProductos();
	
	@Query(value="select p.gama, sum(dp.cantidad) as cantidad \r\n"
			+ "      from detallepedidos dp, productos p\r\n"
			+ "      where p.codigoproducto = dp.codigoproducto\r\n"
			+ "      group by p.gama\r\n"
			+ "      order by cantidad desc\r\n"
			+ "      limit 1\r\n",nativeQuery = true)
	public GamaMasVendida findGamaMasVendido();
}
