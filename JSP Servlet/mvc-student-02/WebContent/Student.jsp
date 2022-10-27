<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border=1>
		<thead>
			<th>Roll No</th>
			<th>Name</th>
			<th>Email</th>
		</thead>

		<c:forEach var="student" items="${studentList}">
			<tr>
				<td>${student.rollNo}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>