<%@page import="java.lang.reflect.Array"%>
<%@ page import="com.aurionpro.model.Student, java.util.List, java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For Each</title>
</head>
<body>
<h3>Functions</h3>
	<!--substring function -->
	<c:set var="string" value="From Today We Have Regular Sessions." />
	${fn:substring(string, 5, 26)}
	<br>

<%
	List<Student> students = new ArrayList<Student>();
	students.add(new Student("Sam", 101, true));
	students.add(new Student("Jack", 102, true));
	students.add(new Student("John", 103, false));
	students.add(new Student("Ronny", 104, false));
	
	pageContext.setAttribute("studentList", students);
%>

<%
	List<String> citys = new ArrayList<>();
	citys.add("Mumbai");
	citys.add("Navi Mumbai");
	citys.add("Pune");
	
	pageContext.setAttribute("cityList", citys);
%>

<c:forEach var="student" items="${studentList}">
<%-- <c:if test="${student.merit}">
	<p>${student.name}</p> 
	<p>${student}</p>
</c:if> --%>

<c:choose>
	<c:when test="${student.merit}">
		<p>${student.name} got scholarship.</p>
	</c:when>
	<c:otherwise>
		<p>${student.name} didn't got scholarship.</p>
	</c:otherwise>
</c:choose>
</c:forEach>

<hr>

<c:forEach var="city" items="${cityList}">
 <p><b>${city}</b></p>
</c:forEach>

</body>
</html>