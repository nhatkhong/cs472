<%--
  Created by IntelliJ IDEA.
  User: Gemi
  Date: 08/05/20
  Time: 05:26 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='ct' uri='/WEB_INF/my-custom-tlds/ct.tld'%>
<html>
<head>
    <title>Lab 14  - JSP Custom Tags</title>
</head>
<body>
    <h1>Welcome to my lab 14 solution</h1>
    <p>The current date/time on this server is:
        <ct:currDate theColor='blue' theSize='200px'/> at
        <ct:currTime theColor='red' theSize='800px'/>
    </p>
</body>
</html>
