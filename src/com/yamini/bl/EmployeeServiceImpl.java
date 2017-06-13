package com.yamini.bl;

import java.sql.SQLException;

import com.yamini.bean.Employee;
import com.yamini.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao=new EmployeeDao();
	
	@Override
	public Employee insertService(Employee emplopyee) throws SQLException {
		return employeeDao.insertEmployee(emplopyee);
	}
	
	@Override
	public boolean booleanInsertService(Employee emplopyee) throws SQLException {
		Employee employee=employeeDao.insertEmployee(emplopyee);
		if(emplopyee==null){
			return false;
		}
		else 
			return true;
	}
	@Override
	public boolean deleteService (int id){
		if (employeeDao.DeleteEmployee(id))
		{
			return true;
		}
		return false;
		
	}
	@Override
	public Employee searchService (int id){
		return (employeeDao.SearchEmployee(id)); 
		
	}

}
