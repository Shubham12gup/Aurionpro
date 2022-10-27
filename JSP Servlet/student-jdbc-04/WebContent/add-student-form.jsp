<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
<div class="px-md-10">
	<h1>Student Form</h1>
	<form action="StudentController" method="post">
		<label>First Name: </label><br>
		<input type="text" name="fname" required>
		<br><br>
		
		<label>Last Name: </label><br>
		<input type="text" name="lname" required>
		<br><br>
		
		<label>Email: </label><br>
		<input type="email" name="email" required>
		<br><br>
		
		<input type="hidden" class="btn-primary" name="command" value="add">
		<input type="submit" class="btn btn-primary" value="ADD">
	</form>
</div>
</body>
</html>