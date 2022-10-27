<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Session JSP Page</h2>
	<%
		if(session.getAttribute("counter")==null){
			session.setAttribute("counter", 0);
		}
		int count = (Integer) session.getAttribute("counter");
	%>
	
	Old session value: <%= session.getAttribute("counter") %><br>
	
	<% session.setAttribute("counter", ++count); %>
	New session value: <%= session.getAttribute("counter") %>
	<%-- 	New session value: ${count+1} --%>
	
	
</body>
</html>