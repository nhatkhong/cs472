<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="/WEB-INF/fragments/header.jsp"%>

<body cz-shortcut-listen="true">
<%@include file="/WEB-INF/fragments/nav.jsp"%>

<main role="main" class="container">
    <p class="date_style">${dateToday}</p>
    <div class="card card_style">
        <div class="card-header">
            <h4>Thank you! Your message has been received as follows:</h4>
        </div>
        <div class="card-body">
            <h6>Name: ${fullName}</h6>
            <p>Gender: ${gender}</p>
            <p>Category: ${category}</p>
            <p class="card-text">Message: ${message}</p>
            <p class="card-text">Please feel free to <a href="contact-form">Contact us</a> again</p>
        </div>
    </div>
    <%@include file="/WEB-INF/fragments/pageCounter.jsp"%>
</main>
<%@include file="/WEB-INF/fragments/footer.jsp"%>
</body>
</html>