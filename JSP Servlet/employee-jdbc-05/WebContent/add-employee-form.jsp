<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<body>

	<h1>Employee Form</h1>
	<div class="d-inline-flex p-2 bd-highlight">	
	
	<form action="EmployeeController">
		<label>Employee No: </label><br>
		<input type="text" name="eno" class="form-control">
		<br>
		
		<label>Employee Name: </label><br>
		<input type="text" name="ename" class="form-control">
		<br>
		
		<label>Job: </label><br>
		<input type="text" name="job" class="form-control">
		<br>
		
		<label>Mangager No: </label><br>
		<input type="text" name="manager" class="form-control">
		<br>
		
		<label>Hiredate: </label><br>
		<input type="text" name="hiredate" class="form-control">
		<br>
		
		<label>Salary: </label><br>
		<input type="text" name="salary" class="form-control">
		<br>
		
		<label>Commission: </label><br>
		<input type="text" name="commission" class="form-control">
		<br>
		
		<label>Department No: </label><br>
		<input type="text" name="deptno" class="form-control">
		<br>
		
		<input type="hidden" class="btn-primary" name="command" value="add">
		<input type="submit" value="ADD" class="btn btn-primary">
	</form>
</div>	

</body>
</html>