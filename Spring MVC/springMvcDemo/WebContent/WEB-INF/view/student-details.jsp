<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1>Student Details</h1>
	<hr>
	<ul>
	<li>First Name: ${theStudent.firstName} </li><br>
	<li>Last Name: ${theStudent.lastName} </li><br>
	<li>Year: ${theStudent.year} </li><br>
	
	<li>Subjects:
	<ol>
	<c:forEach var="subject" items="${theStudent.selectedSubject}">
		<li>${subject}</li>
	</c:forEach>
	</ol>
	</li>
	 <br>
	
	<li>
	Gender: ${theStudent.selectedGender} 
	</li>
	<br>

	<li>No. of ATKT: ${theStudent.atkt}</li>
	<br>
	
	<li>Email: ${theStudent.email}</li>
	<br>
	
	<li>ZipCode: ${theStudent.zipcode}</li>
	<br>
	
	</ul>
	
	
</body>
</html>