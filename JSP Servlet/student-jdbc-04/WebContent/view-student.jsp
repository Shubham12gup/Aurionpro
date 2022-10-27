<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
    <div class="px-md-5">
		<br>
		<input type="button" value="Add Student"  class="btn btn-primary btn-lg" onclick="window.location.href='add-student-form.jsp';">
		<h1>Student Details</h1>
		<form action="StudentController">
			<input type="hidden" name="command" value="search">
			<input type="text" placeholder="enter name here" name="search">
			<span><input type="submit" value="Search" class="btn btn-primary btn-sm"></span>
		</form>
		
		<table class="table table-striped  table-hover table-light table-borderless table-sm">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:if test="${studentList == null}">
			<p>No records found</p>
		</c:if>
		<c:forEach var="student" items="${studentList}">
			
			
			<c:url var="updateLink" value="StudentController">
				<c:param name ="command" value="load"></c:param>
				<c:param name ="studentId" value="${student.id}"></c:param>
			</c:url>
			
			<c:url var="deleteLink" value="StudentController">
				<c:param name ="command" value="delete"></c:param>
				<c:param name ="studentId" value="${student.id}"></c:param>
			</c:url>
			
			<tr>
				<td>${student.id}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.email}</td>
				<td><a href="${updateLink}"><input type="button" class="btn btn-success" value="Edit"></a></td>
				<td><a href="${deleteLink}"><input type="button" class="btn btn-danger" value="Delete"></a></td>
				<td></td>
			</tr>
		</c:forEach>
		
		</table>
	</div>
	
	
	
</body>
</html>