<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.yamini.bean.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yamini Web Dev</title>
<style>
td,th{
border-style:solid;
}

table{
border-collapse: collapse;
}
</style>
</head>
<body>
<% Employee employee=(Employee)request.getAttribute("employee");%>
<table>
<thead>
<tr>
	<th>EId</th>
	<th>Name</th>
	<th>Dept</th>
	<th>Designation</th>
	<th>Salary</th>
	</tr>
</thead>
	<tbody>
	<tr>
	<td><%=employee.getId()%></td>
	<td><%=employee.getName()%></td>
	<td><%=employee.getDept()%></td>
	<td><%=employee.getDesignation()%></td>
	<td><%=employee.getSalary()%></td>
	</tr>
	</tbody>
</table>
</body>
</html>