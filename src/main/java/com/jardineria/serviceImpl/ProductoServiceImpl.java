package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.PedidoBean;
import com.jardineria.bean.ProductosBean;
import com.jardineria.model.Productos;
import com.jardineria.repository.ProductosRepository;
import com.jardineria.service.ProductosService;

@Service
@Transactional
public class ProductoServiceImpl implements ProductosService{

	@Autowired
	ProductosRepository productosRepository;
	
	@Override
	public String saveProducto(ProductosBean productoBean) {
		Productos productos= new Productos();
		BeanUtils.copyProperties(productoBean, productos);
		this.productosRepository.save(productos);
		return productos.getCodigoProducto();
	}

	@Override
	public boolean updateProducto(ProductosBean productoBean) {
		Productos productos= new Productos();
		BeanUtils.copyProperties(productoBean, productos);
		this.productosRepository.save(productos);
		return true;
	}

	@Override
	public ProductosBean findPedidoById(String idProducto) {
		Productos producto = this.productosRepository.findById(idProducto).orElseThrow();
		ProductosBean productoBean = new ProductosBean();
		BeanUtils.copyProperties(producto, productoBean);
		return productoBean;
	}

	@Override
	public List<ProductosBean> mostrarProducto() {
		List<Productos> productosList = this.productosRepository.findAll();
		List<ProductosBean> productosBeanList = new ArrayList<>();
		for(Productos producto:productosList) {
			
			ProductosBean productoBean = new ProductosBean();
			BeanUtils.copyProperties(producto, productoBean);
			productosBeanList.add(productoBean);
		
			
		}
		return productosBeanList;
	}

	@Override
	public boolean deleteProductoById(String idProducto) {
		Productos producto = this.productosRepository.findById(idProducto).orElseThrow();
		this.productosRepository.delete(producto);
		return true;
	}

	
}
