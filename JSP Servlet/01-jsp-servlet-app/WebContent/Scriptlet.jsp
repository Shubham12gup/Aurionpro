<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--Scriptlets are used to write multiple lines of java code. -->
<%
	for(int i=0; i<10; i++){
		out.println("<h2>" +i+ "</h2>");
	}
%>
</body>
</html>