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
	
		boolean isColorSet = false;
		
		 if (cookies != null){
			for(Cookie c:cookies){
				if(c.getName().equals("color")){
					String bgColor = c.getValue();
					out.println("<body style=background-color:" +bgColor+";></body>");
				}
			}
		} 
		
		if (!isColorSet){
			Cookie thisCookie = new Cookie("color", "red");
			thisCookie.setMaxAge(7*24*60*60); //7 days in second
			response.addCookie(thisCookie);
			isColorSet = true;

		}
	%>
	
	<a href="getCookies.jsp">Get Cookies Page</a>
</body>
</html>