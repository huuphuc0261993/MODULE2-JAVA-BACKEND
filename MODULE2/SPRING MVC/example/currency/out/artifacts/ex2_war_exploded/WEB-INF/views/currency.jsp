<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 22/11/2019
  Time: 08:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Ung dung chuyen doi tien te</p>
<form action="/cr2" method="get">
<input type="text" name="value">
<select name="currency">
    <option name="USD">USD</option>
    <option name="VND">VND</option>
</select>
<input type="submit">
</form>
</body>
</html>
