<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Form</h1>
	<form:form action="processStudentForm" modelAttribute="theStudent">
		First name: <form:input path="firstName"/><br><br>
		
		Last name: <form:input path="lastName"/>
		<form:errors path="lastName"></form:errors>
		
		<br><br>
		Select Year:
		<form:select path="year">
			<%-- <form:option value="1"></form:option>
			<form:option value="2"></form:option>
			<form:option value="3"></form:option> --%>
			
			<%-- <c:forEach var="year" items="${theStudent.yearOption}">
				<form:option value="${year.value}"></form:option>
			</c:forEach> --%>
			
			<form:options path="year" items="${theStudent.yearOption}"/>
			
		</form:select>
		<br><br>
		
		Select Subjects:
		<form:checkboxes path="selectedSubject" items="${theStudent.subjects}"/>
		<br><br>
		
		Gender:
		<form:radiobuttons path="selectedGender" items="${theStudent.genders}"/>
		<br><br>
		
		No. of ATKT:
		<form:input path="atkt" />
		<form:errors path="atkt"></form:errors>
		<br><br>
		
		Email:
		<form:input path="email"/>
		<form:errors path="email"></form:errors>
		<br><br>
		
		ZipCode:
		<form:input path="zipcode"/>	
		<form:errors path="zipcode"></form:errors>
		<br><br>
		
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>