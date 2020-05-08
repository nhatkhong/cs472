<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="/WEB-INF/fragments/header.jsp"%>

<body cz-shortcut-listen="true">
    <%@include file="/WEB-INF/fragments/nav.jsp"%>
    <main role="main" class="container">
        <div class="container"><br>
            <h2>List of messages</h2>
            <br>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Customer Name</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Category</th>
                    <th scope="col">Message</th>
                    <th scope="col">&nbsp;</th>
                    <th scope="col">&nbsp;</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="aMessage" items="${messages}" varStatus="iteration">
                    <tr>
                    <th scope="row"><c:out value="${iteration.index+1}"></c:out>.</th>
                    <td><c:out value="${aMessage.fullName}"></c:out></td>
                    <td><c:out value="${aMessage.gender}"></c:out></td>
                    <td><c:out value="${aMessage.category}"></c:out></td>
                    <td><c:out value="${aMessage.message}"></c:out></td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <%@include file="/WEB-INF/fragments/pageCounter.jsp"%>
    </main>
    <%@include file="/WEB-INF/fragments/footer.jsp"%>
</body>
</html>
