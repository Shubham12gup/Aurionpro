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

<%-- User Name: <%= request.getParameter("fname") %> <br><br> --%>

First Name : ${param.fname} <br><br>
Last Name : ${param.lname} <br><br>
Country : ${param.country} <br><br>
Gender : ${param.gender} <br><br>
Languages : 
	<%
		String languages[] = request.getParameterValues("lang");
		for(String l:languages){
			out.println(l + "<br>");
		}
		pageContext.setAttribute("favLang", languages);
	%>
	
	<c:forEach var="language" items="${favLang}">
		<p>${language}</p>
	</c:forEach>


</body>
</html>