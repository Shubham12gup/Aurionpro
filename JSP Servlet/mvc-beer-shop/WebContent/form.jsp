<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form</title>
</head>
<body>
<h1 align="center">Beer Selection Page</h1>
<form action="BeerController">

	<p>Select Beer Characteristic</p>

	Select Color:
	<select name="color">
		<option>Light</option>
		<option>Dark</option>
		<option>Amber</option>
		<option>Brown</option>
	</select>
	<br><br>
	
	<input type="submit" value="SUBMIT">
</form>
</body>
</html>