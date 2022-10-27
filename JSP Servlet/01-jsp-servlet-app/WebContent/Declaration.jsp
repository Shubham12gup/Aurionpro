<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.html"></jsp:include>
<!-- Declaration -->
<!--  It is used to declare java code-->
<%!
	String showGreeting(String name){
		return "Hello " + name;
	}
%>

<%= showGreeting("Shubham") %>
<jsp:include page="Footer.html"></jsp:include>

</body>
</html>