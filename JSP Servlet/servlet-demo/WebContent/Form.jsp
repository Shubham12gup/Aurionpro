<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="authenticate">
		First Name: <input type="text" name="fname"> <br><br>
		Last Name: <input type="text" name="lname">	<br><br>
		Country: 
		<select name="country">
			<option>India</option>
			<option>Pakistan</option>
			<option>USA</option>
			<option>China</option>
			<option>Nepal</option>
		</select>
		<br><br>
		
		Gender: <br>
		<input type="radio" name="gender" value="male"> Male <br>
		<input type="radio" name="gender" value="female"> Female <br>
		
		<br>
		
		Languages: <br>
		<input type="checkbox" name="lang" value="Java"> Java <br>
		<input type="checkbox" name="lang" value="C++"> C++	<br>
		<input type="checkbox" name="lang" value="Python"> Python <br>
		<input type="checkbox" name="lang" value="C"> C <br>
		<input type="checkbox" name="lang" value="JavaScript"> JavaScript <br>
		<br>
		<br>
		
		<input type="submit" value="submit">
		
		
	</form>

</body>
</html>