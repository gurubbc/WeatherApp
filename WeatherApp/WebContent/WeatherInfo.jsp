<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1> Weather Info </h1>
<p> Welcome to Weather Info Page </p>
<p> The city you entered is <% out.println(request.getAttribute("cityname")); %> </p>
<p> <% out.println(request.getAttribute("msg")); %> </p>


</body>
</html>