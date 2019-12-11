<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 05/11/2019
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="converter.jsp" method="post">
    <label>Rate:</label>
    <input type="text" value="22000" name="rate"><br>
    <label>USD:</label>
    <input type="text" value="0" name="usd"><br>
    <input type="submit" value="Converter">
  </form>
  </body>
</html>
