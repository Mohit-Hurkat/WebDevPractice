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

public class SearchController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService employeeService = new EmployeeServiceImpl();
		int id = Integer.parseInt(request.getParameter("SearchId"));
		Employee employee = employeeService.searchService(id);
		String link="";
		if (employee == null) {
			request.setAttribute("message", "User Not Found");
			link="output.jsp";

		} else {
			request.setAttribute("employee", employee);
			link="index.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(link);
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
