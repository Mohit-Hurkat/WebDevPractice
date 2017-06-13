package com.yamini.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yamini.bean.Employee;
import com.yamini.bl.EmployeeService;
import com.yamini.bl.EmployeeServiceImpl;

public class EmployeeInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean value=false;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp=new Employee();
		emp.setName(request.getParameter("empname"));
		emp.setDesignation(request.getParameter("empdesig"));
		emp.setDept(request.getParameter("empdeptt"));
		emp.setSalary(request.getParameter("empsalary"));
		EmployeeService employeeService=new EmployeeServiceImpl();
		try {
			value=employeeService.booleanInsertService(emp);
	if(value){
		request.setAttribute("message", "Record Inserted");
	}
	else{
		request.setAttribute("message", "Record NOT Inserted");
	}	
		} catch (SQLException e1) {
			request.setAttribute("message", e1);
			e1.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
//		response.sendRedirect("output.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

