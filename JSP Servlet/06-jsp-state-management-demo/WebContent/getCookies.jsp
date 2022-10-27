<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie cookies[] = request.getCookies();
	if (cookies != null){
		for(Cookie c:cookies){
			if(c.getName().equals("color")){
				String bgColor = c.getValue();
				out.println("<body style=background-color:" +bgColor+";></body>");
			}
		}
	}
	%>

</body>
</html>