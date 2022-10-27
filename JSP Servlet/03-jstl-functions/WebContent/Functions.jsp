<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Functions</title>
</head>
<body>
	<h3>Functions</h3>
	<!--substring function -->
	<c:set var="string" value="From Today We Have Regular Sessions." />
	${fn:substring(string, 5, 26)}
	<br>
	
	<c:set var="String" value="Welcome to javatpoint"/>    
	<c:if test="${fn:contains(String, 'javatpoint')}">  
	   <p>Found javatpoint string<p>  
	</c:if>  

	<c:if test="${fn:containsIgnoreCase(String, 'JAVATPOINT')}">  
	   <p>Found JAVATPOINT string<p>  
	</c:if>  
	
	<c:set var="string1" value="Hii, Good Morning"/> 
	<p>Index:${fn:indexOf(string1, "Good")}</p>  
	
	<c:set var="str1" value=" Welcome to JSP programming "/>  
	<p>String-1 Length is : ${fn:length(str1)}</p>  
	  
	<c:set var="str2" value="${fn:trim(str1)}" />  
	<p>String-2 Length is : ${fn:length(str2)}</p>  
	
	<p>Final value of string is : ${str2}</p>  
	
	<c:set var="string" value="SHUBHAM"/>  
	<p>LowerCase: ${fn:toLowerCase(string)}</p>
	
	<c:set var="site" value="shubham"/>  
	<p>Uppercase: ${fn:toUpperCase(site)} </p>
	
	<c:set var="author" value="Sagar is a consultant"/>  
	<p> Replacing Sagar to Sunil: ${fn:replace(author, "Sagar", "Sunil")}  
</body>
</html>

