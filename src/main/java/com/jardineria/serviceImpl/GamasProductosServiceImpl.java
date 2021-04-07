package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.GamasProductosBean;
import com.jardineria.model.GamasProductos;
import com.jardineria.repository.GamasProductosRepository;
import com.jardineria.service.GamasProductosService;

@Service
@Transactional
public class GamasProductosServiceImpl implements GamasProductosService{

	@Autowired
	private GamasProductosRepository gamasProductosRepo;
	
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
	public boolean deleteGamaProducto(Integer id) {
		GamasProductos gamaProducto = this.gamasProductosRepo.findById(id).orElseThrow();
		this.gamasProductosRepo.delete(gamaProducto);
		
		return true;
	}
	
}
