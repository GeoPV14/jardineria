package com.jardineria.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.OficinaBean;
import com.jardineria.model.Oficina;
import com.jardineria.repository.OficinaRepository;
import com.jardineria.service.OficinaService;

@Service
@Transactional
public class OficinaServiceImpl implements OficinaService{
	
	//@Autowired
	//private OficinaRepository oficeRepo;

	@Override
	public String saveOficina(OficinaBean oficinaBean) {
		
		Oficina oficina = new Oficina();
		
		oficina.setCiudad(oficinaBean.getCiudad());
		oficina.setPais(oficinaBean.getPais());
		oficina.setRegion(oficinaBean.getRegion());
		oficina.setRegion(oficinaBean.getRegion());
		oficina.setCp(oficinaBean.getCp());
		oficina.setTelefono(oficinaBean.getTelefono());
		oficina.setLineDirec01(oficinaBean.getLineDirec01());
		oficina.setLineDirec02(oficinaBean.getLineDirec02());
		
		//oficeRepo.save(oficina);
				
		return oficina.getCodOficina();
	}

	@Override
	public boolean updateOficina(OficinaBean oficinaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OficinaBean findOficinaById(String idOficina) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OficinaBean> mostrarOficina() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOficinaById(String idOficina) {
		// TODO Auto-generated method stub
		return false;
	}

}
