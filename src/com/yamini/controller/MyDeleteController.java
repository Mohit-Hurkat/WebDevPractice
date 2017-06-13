package com.yamini.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yamini.bean.Employee;
import com.yamini.bl.EmployeeService;
import com.yamini.bl.EmployeeServiceImpl;

public class MyDeleteController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Employee emp=new Employee();
		int id=Integer.parseInt(request.getParameter("EId"));
		EmployeeService employeeService=new EmployeeServiceImpl();
		if (employeeService.deleteService(id)){
			request.setAttribute("message", "Deleted.");
		}
		else
		{
			request.setAttribute("message", "Not Deleted.");
		}
		RequestDispatcher rd=request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request,response);
	}
}
