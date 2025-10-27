<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/27/2025
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="home" method="post">
    <input name="amountUSD" type="hidden" value="${amountUSD}">
    <label>
        Result:
        <f:formatNumber value="${money}" groupingUsed="true"/>đ
    </label>
    <button>Back</button>
</form>

</body>
</html>
