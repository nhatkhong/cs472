<%--
  Created by IntelliJ IDEA.
  User: Gemi
  Date: 07/05/20
  Time: 07:49 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head></head>
<body cz-shortcut-listen="true">
<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4 nav_style">
    <a class="navbar-brand" href="#">CS472-WAP ::: Lesson13 - JSP MVC</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse"
            data-target="#navbarCollapse" aria-controls="navbarCollapse"
            aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
            <c:choose>
                <c:when test="${currentPage == 'index'}">
                    <li class="nav-item active"><a class="nav-link" href="index">Home
                        <span class="sr-only">(current)</span>
                    </a></li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item"><a class="nav-link" href="index">Home
                        <span class="sr-only">(current)</span>
                    </a></li>
                </c:otherwise>
            </c:choose>

            <li class="nav-item"><a class="nav-link" href="#">About</a></li>

            <c:choose>
                <c:when test="${currentPage == 'contact-form'}">
                    <li class="nav-item active"><a class="nav-link"
                                                   href="contact-form">Contact Us</a></li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item"><a class="nav-link" href="contact-form">Contact
                        Us</a></li>
                </c:otherwise>
            </c:choose>

            <c:choose>
                <c:when test="${currentPage == 'contact-message'}">
                    <li class="nav-item active"><a class="nav-link"
                                                   href="contact-message">Contact Messages</a></li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item"><a class="nav-link" href="contact-message">Contact
                        Messages</a></li>
                </c:otherwise>
            </c:choose>
        </ul>

        <form class="form-inline mt-2 mt-md-0" id="searchMessageForm"
              method="post" action="contact-message">
            <input name="searchItem" id="searchItem"
                   class="form-control mr-sm-2" type="text" placeholder="Search"
                   aria-label="Search">
            <c:choose>
                <c:when test="${currentPage == 'contact-message'}">
                    <button class="btn btn-outline-success my-2 my-sm-0 btn_search"
                            type="submit">Search</button>
                </c:when>
                <c:otherwise>
                    <button class="btn btn-outline-success my-2 my-sm-0 btn_search"
                            type="submit" disabled="disabled">Search</button>
                </c:otherwise>
            </c:choose>
        </form>
    </div>
</nav>
</body>
</html>