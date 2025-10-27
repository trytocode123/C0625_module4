<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/27/2025
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    Exchange Currency
</p>
<form action="exchange" method="post">
    <label>
        Amount of USD
    </label>

    <input name="amountUSD" value="${amountUSD}">
    <button>
        Save
    </button>
</form>

</body>
</html>
