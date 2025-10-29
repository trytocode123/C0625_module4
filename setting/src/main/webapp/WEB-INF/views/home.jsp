<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/29/2025
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Settings</h2>
<form:form action="/home/update" modelAttribute="setting" method="post">
    <strong>
        Languages
    </strong>

    <form:select path="language">
        <form:options items="${lans}"/>
    </form:select><br>

    <strong>
        Page Size:
    </strong>

    Show
    <form:select path="size">
        <form:options items="${sizes}"/>
    </form:select>
    emails per page<br>
    <label for="enable">
        <strong>
            Spam filters:
        </strong>
        <form:checkbox id="enable" path="spamFilter" value="true"/> Enable spams filter
    </label>

    <br>

    <div style="display: flex">
        <strong>
            Signature:
        </strong>

        <form:textarea path="signature"/>
    </div>

    <button>Update</button>
    <button type="button">Cancel</button>
</form:form>
</body>
</html>
