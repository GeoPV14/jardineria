package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.BuscaTodosJefes;
import com.jardineria.bean.EmpleadosBean;


public interface EmpleadosService {
	
	public Integer saveEmpleados(EmpleadosBean empleadosBean);//Create
	public EmpleadosBean findEmpleadosById(Integer codigoEmpleado);//Read
	public boolean updateEmpleados(EmpleadosBean empleadosBean);//Update
	public boolean deleteEmpleados(Integer codigoEmpleado);//Delete
	public List<EmpleadosBean> findAllEmpleados();//ReadAll
	
	public List<BuscaTodosJefes> findAllJefes();//Busca puros jefes

}
