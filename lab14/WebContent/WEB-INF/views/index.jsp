<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab14</title>
</head>
<body>
	<h1>Welcome to my lab 14 solution</h1>
	<p>
		<%-- //Scriptlet String strDateTime = LocalDateTime.now().toString  --%>
		The current date/time on this server is: <c:out value="${LocalDateTime.now()}"></c:out>
		<%-- <mtagprefix:mytagname attrib="" /> --%>
		<%-- <grpx:drawChart width="300px" height="300px">World Economic Growth</<grpx:drawChart>  --%>
		<%-- Example custom tags: Thymeleaf elements, JavaServer Faces UI components  --%>
		<%-- <h:calendar />  --%>
	</p>
</body>
</html>