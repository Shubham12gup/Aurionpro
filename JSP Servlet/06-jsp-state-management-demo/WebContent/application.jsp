<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Application JSP Page</h2>
	<%
		if(application.getAttribute("counter")==null){
			application.setAttribute("counter", 0);
		}
		int count = (Integer) application.getAttribute("counter");
	%>
	
	Old application value: <%= application.getAttribute("counter") %><br>
	
	<% application.setAttribute("counter", ++count); %>
	New application value: <%= application.getAttribute("counter") %>
	<%-- 	New application value: ${count+1} --%>
	
	
</body>
</html>