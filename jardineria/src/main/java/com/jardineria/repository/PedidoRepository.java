package com.jardineria.repository;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardineria.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, String>{
>>>>>>> 93fcaacc50fd5c75537f9f136c075796d3b20807

}
