<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<body>
<!-- 	<div class="px-md-10"> -->
	<div class="h-100 d-flex align-items-center justify-content-">
	
	<h1>Student Update Form</h1>
		</div>
	
	<div class="h-100 d-flex align-items-center justify-content-center">
	
	<form action="StudentController">
		<label>First Name: </label><br>
		<input type="text" name="fname" value="${studentRecord.firstName}" class="form-control">
		<br>
		
		<label>Last Name: </label><br>
		<input type="text" name="lname" value="${studentRecord.lastName}" class="form-control">
		<br>
		
		<label>Email: </label><br>
		<input type="email" name="email" value="${studentRecord.email}" class="form-control">
		<br>
		
		<input type="hidden" class="btn-primary" name="command" value="update">
		<input type="hidden" class="btn-primary" name="id" value="${studentRecord.id}">
		
		<input type="submit" class="btn btn-primary" value="Update">
	</form>
	</div>
</body>
</html>