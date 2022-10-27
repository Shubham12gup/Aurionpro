<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="uname" value="${param.uname}"/>    
	<c:set var="pass" value="${param.pass}"/>    
	<c:choose>
	<c:when test="${(uname == 'admin') && (pass == 'admin')}">
		<p> Welcome to JSTL</p>
	</c:when>
	<c:otherwise>
		<p>User Invalid<br>Login with right credentials</p>
		<a href="Login.html">Login</a> 
<%-- 	<% response.sendRedirect("Login.html"); %> --%>
	</c:otherwise>
	</c:choose>
	
		
</body>
</html>