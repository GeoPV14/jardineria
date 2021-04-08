package com.jardineria.service;

import java.util.List;

import com.jardineria.bean.BuscaTodosJefes;
import com.jardineria.bean.EmpleadoNomApellBean;
import com.jardineria.bean.EmpleadosBean;
import com.jardineria.bean.EmpleadosCountBean;
import com.jardineria.bean.EmpleadosNyCBean;


public interface EmpleadosService {
	
	public Integer saveEmpleados(EmpleadosBean empleadosBean);//Create
	public EmpleadosBean findEmpleadosById(Integer codigoEmpleado);//Read
	public boolean updateEmpleados(EmpleadosBean empleadosBean);//Update
	public boolean deleteEmpleados(Integer codigoEmpleado);//Delete
	public List<EmpleadosBean> findAllEmpleados();//ReadAll
	
	public List<BuscaTodosJefes> findAllJefes();//Busca puros jefes
	public List<EmpleadosNyCBean> findEmpNyC();//Buscar empleados y cargos sinque sean directores de oficina
	public EmpleadosCountBean countEmp();//Contar empleados que hay en la empresa
	
	public List<EmpleadoNomApellBean> findEmpleadosTrabajanBarcelona();

}
