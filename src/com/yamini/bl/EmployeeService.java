package com.yamini.bl;

import java.sql.SQLException;

import com.yamini.bean.Employee;

public interface EmployeeService{
	
	public Employee insertService(Employee emplopyee) throws SQLException;

	boolean booleanInsertService(Employee emplopyee) throws SQLException;

	boolean deleteService(int id);

	Employee searchService(int id);

}
