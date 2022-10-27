<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<body class="bg-">
    <div class="px-5 mt-4">

	<input type="button" class="btn btn-primary btn-lg" value="Add Employee" onclick="window.location.href='add-employee-form.jsp'">
	<h1>Employee Details</h1>
	
	
	<table class="table table-striped  table-hover table-light table-borderless table-sm">
	<tr>
		<th>EMPNO</th>
		<th>NAME</th>
		<th>JOB</th>
		<th>MANAGER</th>
		<th>HIREDATE</th>
		<th>SALARY</th>
		<th>COMMISSION</th>
		<th>DEPTNO</th>
		<th>EDIT</th>
		<th>DELETE</th>
	</tr>
	<c:forEach var="employee" items="${employeeList}">
	
		<c:url var="updateLink" value="EmployeeController">
			<c:param name="command" value="load"></c:param>
			<c:param name="employeeId" value="${employee.empNo}"></c:param>
		</c:url>
		
		<c:url var="deleteLink" value="EmployeeController">
			<c:param name="command" value="delete"></c:param>
			<c:param name="employeeId" value="${employee.empNo}"></c:param>
		</c:url>
	
		<tr>
			<td>${employee.empNo}</td>
			<td>${employee.eName}</td>
			<td>${employee.job}</td>
			<td>${employee.manager}</td>
			<td>${employee.hireDate}</td>
			<td>${employee.salary}</td>
			<td>${employee.commission}</td>
			<td>${employee.deptNo}</td>
			<td><a href="${updateLink}"><input type="button" class="btn btn-success" value="Edit"></a></td>
			<td><a href="${deleteLink}"><input type="button" class="btn btn-danger" value="Delete"></a></td>
		</tr>
	</c:forEach>
	</table>
	
	</div>
	
</body>
</html>