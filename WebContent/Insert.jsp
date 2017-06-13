<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
<link rel="stylesheet" type="text/css" href="ACSS.css">
</head>
<body >
<fieldset >
<form action="./InsertController" method="post">
Employee&nbsp; Name&nbsp;:&nbsp;<input type="text" name="empname" /><br><br>
Employee &nbsp;Designation&nbsp;:&nbsp;<input type="text" name="empdesig" /><br><br>
Employee &nbsp;Department&nbsp;:&nbsp;<input type="text" name="empdeptt" /><br><br>
Employee &nbsp;Salary&nbsp;:&nbsp;&nbsp;:&nbsp;<input type="text" name="empsalary" /><br><br>
<input type="submit" value="Insert"/>
</form>
</fieldset>
<a href="Home.jsp">Home Page</a>
</body>
</html>