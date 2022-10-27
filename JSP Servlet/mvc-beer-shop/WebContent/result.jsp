<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
	<p>Beer Selection Advice</p>
	<c:forEach var="beer" items="${brands}">
		<p>Try: ${beer}</p>
	</c:forEach>
	
	<!-- Java Code -->
	<%-- <%
		List<String> br = (ArrayList) request.getAttribute("brands");
		for (String b:br){
			out.print("<br>Try : "+b);
		}
	%> --%>
	
	<a href="form.jsp">Get Back To Form</a>
</body>
</html>