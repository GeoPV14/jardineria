package com.jardineria.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.PagosBean;
import com.jardineria.model.Pagos;
import com.jardineria.repository.PagosRespository;
import com.jardineria.service.PagosService;

@Service
@Transactional
public class PagosServiceImpl implements PagosService{

	@Autowired
	PagosRespository pagosRepository;
	
	@Override
	public String savePagos(PagosBean pagosBean) {
		Pagos pago = new Pagos();
		BeanUtils.copyProperties(pagosBean, pago);
		this.pagosRepository.save(pago);
		return pago.getIdTransaccion();
	}

	@Override
	public boolean updatePagos(PagosBean pagosBean) {
		Pagos pago = this.pagosRepository.findById(pagosBean.getIdTransaccion()).orElseThrow();
		BeanUtils.copyProperties(pagosBean, pago);
		this.pagosRepository.save(pago);
		return true;
	}

	@Override
	public PagosBean findOPagosById(String idPago) {
		Pagos pago = this.pagosRepository.findById(idPago).orElseThrow();
		PagosBean pagoBean=new PagosBean();
		BeanUtils.copyProperties(pago, pagoBean);
		return pagoBean;
	}

	@Override
	public List<PagosBean> mostrarPagos() {
		List<Pagos> pagosList = this.pagosRepository.findAll();
		List<PagosBean> pagosBeanList = new ArrayList<>();
		for(Pagos pago:pagosList) {
			PagosBean pagoBean=new PagosBean();
			BeanUtils.copyProperties(pago, pagoBean);
			pagosBeanList.add(pagoBean);
		}
		return pagosBeanList;
	}

	@Override
	public boolean deletePagosById(String idPagos) {
		Pagos pago = this.pagosRepository.findById(idPagos).orElseThrow();
		this.pagosRepository.delete(pago);
		if(pago==null) return false;
		return true;
	}


	

}
