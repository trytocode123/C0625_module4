<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/28/2025
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="save" method="post">
    <c:forEach items="${condimentsList}" varStatus="status" var="condiment">
        <input id="${condiment}" name="condiment" type="checkbox" value="${condiment}"> <label
            for="${condiment}">${condiment}</label>
    </c:forEach>
    <br>
    <button>Save</button>
</form>

<c:forEach items="${condiments}" varStatus="status" var="condiment">
    <c:choose>
        <c:when test="${status.last}">
            <c:out value="${condiment}"/>
        </c:when>
        <c:otherwise>
            <c:out value="${condiment},"/>
        </c:otherwise>
    </c:choose>
</c:forEach>
</body>
</html>
