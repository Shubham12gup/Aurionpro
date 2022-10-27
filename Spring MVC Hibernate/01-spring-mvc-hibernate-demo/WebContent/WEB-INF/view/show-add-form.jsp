<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" 
integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
<div class="mx-5 px-5 pt-3 pb-3">
<h2>Student Form</h2>

<form:form action="add" modelAttribute="theStudent"><br>
First Name: <form:input path="firstName" class="form-control"/><br>
Last Name: <form:input path="lastName" class="form-control"/><br>
Email: <form:input path="email" class="form-control"/><br>

<form:hidden path="id"/>
<input type="submit" value="ADD" class="btn btn-primary">	
</form:form>
</div>
</body>
</html>