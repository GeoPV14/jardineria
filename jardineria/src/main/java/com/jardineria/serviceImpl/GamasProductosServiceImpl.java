package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.GamasProductosBean;
import com.jardineria.model.GamasProductos;
import com.jardineria.model.Productos;
import com.jardineria.repository.GamasProductosRepository;
import com.jardineria.repository.ProductosRepository;
import com.jardineria.service.GamasProductosService;

@Service
@Transactional
public class GamasProductosServiceImpl implements GamasProductosService{

	@Autowired
	private GamasProductosRepository gamasProductosRepo;
	
	@Autowired
	private ProductosRepository productosRepo;
	
	@Override
	public boolean saveGamaProducto(GamasProductosBean gamaProductoBean) {
		GamasProductos gamaProducto = new GamasProductos();
		BeanUtils.copyProperties(gamaProductoBean, gamaProducto);
		this.gamasProductosRepo.save(gamaProducto);
		return true;
	}

	@Override
	public GamasProductosBean findByIdGamaProducto(String id) {
		GamasProductos gamaProductos = this.gamasProductosRepo.findByGama(id);
		GamasProductosBean gamaProductosBean = new GamasProductosBean();
		BeanUtils.copyProperties(gamaProductos, gamaProductosBean);
		return gamaProductosBean;
	}

	@Override
	public List<GamasProductosBean> findAllGamasProductos() {
		List<GamasProductos> gamaProductoList = this.gamasProductosRepo.findAll();
		List<GamasProductosBean> gamaProductoBeanList = new ArrayList<>();
		
		for(GamasProductos gamaProducto : gamaProductoList){
			GamasProductosBean gamaProductoBean = new GamasProductosBean();
			BeanUtils.copyProperties(gamaProducto, gamaProductoBean);
			gamaProductoBeanList.add(gamaProductoBean);
		}
		return gamaProductoBeanList;
	}

	@Override
	public boolean updateGamaProducto(GamasProductosBean gamaProductoBean) {
		
		GamasProductos gamaProducto = this.gamasProductosRepo.findByGama(gamaProductoBean.getGama());
		BeanUtils.copyProperties(gamaProductoBean, gamaProducto);
		this.gamasProductosRepo.save(gamaProducto);
		
		return true;
	}

	@Override
	public boolean deleteGamaProducto(String id) {
		GamasProductos gamaProducto = this.gamasProductosRepo.findByGama(id);
		this.gamasProductosRepo.delete(gamaProducto);
		
		return true;
	}

	@Override
	public List<GamasProductosBean> contarAllGamasProductos() {
		
		List<Productos> gamaProductList = this.productosRepo.findAll();
		List<GamasProductosBean> gamaProductBeanList = new ArrayList<>();
		
		GamasProductosBean gamasProd01Bean = new GamasProductosBean("Aromáticas", 0);
		GamasProductosBean gamasProd02Bean = new GamasProductosBean("Frutales", 0);
		GamasProductosBean gamasProd03Bean = new GamasProductosBean("Herbaceas", 0);
		GamasProductosBean gamasProd04Bean = new GamasProductosBean("Herramientas", 0);
		GamasProductosBean gamasProd05Bean = new GamasProductosBean("Ornamentales", 0);
		
		int p01 = 0, p02 = 0, p03 = 0, p04 = 0, p05 = 0;
		
		for(Productos gamaProd : gamaProductList) {
			
			if(gamaProd.getGamaProducto().getGama().equals("Aromáticas")) {
				p01 += 1;
			}else if(gamaProd.getGamaProducto().getGama().equals("Frutales")) {
				p02 += 1;
			}else if(gamaProd.getGamaProducto().getGama().equals("Herbaceas")) {
				p03 += 1;
			}else if(gamaProd.getGamaProducto().getGama().equals("Herramientas")) {
				p04 += 1;
			}else if(gamaProd.getGamaProducto().getGama().equals("Ornamentales")) {
				p05 += 1;
			}//EndIf			
		}//EndFor
		
		gamasProd01Bean.setCountGamaProd(p01);
		gamasProd02Bean.setCountGamaProd(p02);
		gamasProd03Bean.setCountGamaProd(p03);
		gamasProd04Bean.setCountGamaProd(p04);
		gamasProd05Bean.setCountGamaProd(p05);
		
		gamaProductBeanList.add(gamasProd01Bean);
		gamaProductBeanList.add(gamasProd02Bean);
		gamaProductBeanList.add(gamasProd03Bean);
		gamaProductBeanList.add(gamasProd04Bean);
		gamaProductBeanList.add(gamasProd05Bean);
		
		return gamaProductBeanList;
	}
	
}
