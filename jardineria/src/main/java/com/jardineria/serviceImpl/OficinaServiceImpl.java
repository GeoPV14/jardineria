package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.OficinaBean;
import com.jardineria.model.Oficina;
import com.jardineria.repository.OficinaRepository;
import com.jardineria.service.OficinaService;

@Service
@Transactional
public class OficinaServiceImpl implements OficinaService{
	
	@Autowired
	private OficinaRepository oficeRepo;

	@Override
	public String saveOficina(OficinaBean oficinaBean) {
		
		Oficina oficina = new Oficina();
		
		oficina.setCodOficina(oficinaBean.getCodOficina());
		oficina.setCiudad(oficinaBean.getCiudad());
		oficina.setPais(oficinaBean.getPais());
		oficina.setRegion(oficinaBean.getRegion());
		oficina.setRegion(oficinaBean.getRegion());
		oficina.setCp(oficinaBean.getCp());
		oficina.setTelefono(oficinaBean.getTelefono());
		oficina.setLineDirec01(oficinaBean.getLineDirec01());
		oficina.setLineDirec02(oficinaBean.getLineDirec02());
		
		this.oficeRepo.save(oficina);
				
		return oficina.getCodOficina();
	}

	@Override
	public boolean updateOficina(OficinaBean oficinaBean) {
		
		Oficina oficina = this.oficeRepo.findById(oficinaBean.getCodOficina()).orElseThrow();
		BeanUtils.copyProperties(oficinaBean, oficina);
		this.oficeRepo.save(oficina);
		
		return true;
	}

	@Override
	public OficinaBean findOficinaById(String idOficina) {
		
		Oficina oficina = this.oficeRepo.findById(idOficina).orElseThrow();
		OficinaBean oficeBean = new OficinaBean();
		
		BeanUtils.copyProperties(oficina, oficeBean);
		
		return oficeBean;
	}

	@Override
	public List<OficinaBean> mostrarOficina() {
		List<Oficina> oficinaList = this.oficeRepo.findAll();
		List<OficinaBean> oficinaBeanList = new ArrayList<>();
		
		for(Oficina ofi: oficinaList) {
			
			OficinaBean ofiBean = new OficinaBean();
			BeanUtils.copyProperties(ofi, ofiBean);
			oficinaBeanList.add(ofiBean);
		}		
		
		return oficinaBeanList;
	}

	@Override
	public boolean deleteOficinaById(String idOficina) {
		
		Oficina oficina = this.oficeRepo.findById(idOficina).orElseThrow();
		this.oficeRepo.delete(oficina);
		
		return true;
	}

}
