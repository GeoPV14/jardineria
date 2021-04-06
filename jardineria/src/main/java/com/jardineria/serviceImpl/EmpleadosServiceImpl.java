package com.jardineria.serviceImpl;

/*import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardineria.bean.EmpleadosBean;
import com.jardineria.model.Empleados;
import com.jardineria.repository.EmpleadosRepository;
import com.jardineria.service.EmpleadosService;

@Service
@Transactional
public class EmpleadosServiceImpl implements EmpleadosService {

	@Autowired
	EmpleadosRepository empleadosRepo;

	@Override
	public Integer saveEmpleados(EmpleadosBean empleadosBean) {
		Empleados empleados = new Empleados();

		empleados.setNombre(empleadosBean.getNombre());
		empleados.setApellido1(empleadosBean.getApellido1());
		empleados.setApellido2(empleadosBean.getApellido2());
		empleados.setExtension(empleadosBean.getExtension());
		empleados.setEmail(empleadosBean.getEmail());
		empleados.setPuesto(empleadosBean.getPuesto());

		this.empleadosRepo.save(empleados);

		return empleados.getCodigoEmpleado();
	}

	@Override
	public EmpleadosBean findEmpleadosById(Integer codigoEmpleado) {
		Empleados empleados = this.empleadosRepo.findById(codigoEmpleado).orElseThrow();
		EmpleadosBean empleadosBean = new EmpleadosBean();

		BeanUtils.copyProperties(empleados, empleadosBean);

		return empleadosBean;
	}

	@Override
	public boolean updateEmpleados(EmpleadosBean empleadosBean) {
		Empleados empleados = this.empleadosRepo.findById(empleadosBean.getCodigoEmpleado()).orElseThrow();
				
		BeanUtils.copyProperties(empleadosBean, empleados);
		
		this.empleadosRepo.save(empleados);
				
		return true;
	}

	@Override
	public boolean deleteEmpleados(Integer codigoEmpleado) {
		Empleados empleados = this.empleadosRepo.findById(codigoEmpleado).orElseThrow();
		
		this.empleadosRepo.delete(empleados);
		
		return true;
	}

	@Override
	public List<EmpleadosBean> findAllEmpleados() {
		List<Empleados> empleadosList = this.empleadosRepo.findAll();
		List<EmpleadosBean> empleadosBeanList = new ArrayList<>();
		
		for (Empleados empleado : empleadosList) {
			EmpleadosBean empleadosBean = new EmpleadosBean();
			
			BeanUtils.copyProperties(empleado, empleadosBean);
		}
		return empleadosBeanList;
	}

}*/
