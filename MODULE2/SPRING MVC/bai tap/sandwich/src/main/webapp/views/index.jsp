<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 02/12/2019
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Sandwich Condiments</h1>
<form method="post" action="/save">
    <input type="checkbox" name="check" value="Lettuce">Lettuce
    <input type="checkbox" name="check" value="Tomato">Tomato
    <input type="checkbox" name="check" value="Mustard">Mustard
    <input type="checkbox" name="check" value="Sprouts">Sprouts
    <hr>
    <input type="submit" value="save">
</form>
</body>
</html>
