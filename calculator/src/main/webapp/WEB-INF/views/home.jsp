<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/28/2025
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/calc" method="post">
    <input name="firstNum" value="${firstNum}">
    <input name="secondNum" value="${secondNum}">
    <input name="operator" id="inputCalc" type="hidden">
    <div>
        <button onclick="calc('+')">Addition(+)</button>
        <button onclick="calc('-')">Substraction(-)</button>
        <button onclick="calc('X')">Multiplication(X)</button>
        <button onclick="calc('/')">Division(/)</button>
    </div>

</form>
<c:out value="${mess}"/>
<script>
    function calc(operator) {
        document.querySelector("#inputCalc").value = operator;
    }
</script>
</body>
</html>
