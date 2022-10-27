<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>    

	<h3>Beer Selection Advice</h3>
	<h4>Beer Color: ${col}</h4>
	
	
	
	<!--  Using JSP Tags-->
	<c:forEach var="beer" items="${brands}">
		<p>Try: ${beer}</p>
	</c:forEach>

	<a href="Form.jsp">Get back to form</a>
	
</body>
</html>