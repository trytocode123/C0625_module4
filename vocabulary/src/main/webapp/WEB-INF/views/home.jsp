<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/27/2025
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Translation</h2>
<form action="home" method="post">
    <label>
        Vocabulary
    </label>

    <input name="voc" value="${input}">
    <br/>
    <button>Translate</button>
</form>

<c:out value="${voc}"/>

</body>


</html>
