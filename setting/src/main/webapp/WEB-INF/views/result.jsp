<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/29/2025
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Settings</h2>

<strong>
    Languages:
</strong>

<c:out value="${setting.language}"/><br>
<strong>
    Page Size:
</strong>

<c:out value="${setting.size}"/> emails per page<br>
<label for="enable">
    <strong>
        Spam filters:
    </strong>
    <c:choose>
        <c:when test="${setting.spamFilter}">
            Enable spams filter
        </c:when>
        <c:otherwise>
            Not enable spams filter
        </c:otherwise>
    </c:choose>
</label>
<br>
<div style="display: flex">
    <strong style="margin-right: 5px">
        Signature:
    </strong>

    <pre style="white-space: pre-wrap; margin: 0; font-family: inherit"><c:out value="${setting.signature}"
                                                                               escapeXml="false"/></pre>
</div>
</body>
</html>
