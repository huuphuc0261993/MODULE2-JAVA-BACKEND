<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 04/11/2019
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    <label>Rate:</label><br/>
    <input type="text" name = "rate" placeholder="rate" value="22000"><br/>
    <label>USD:</label><br/>
    <input type="text" name="usd" placeholder="usd" value="0"><br/>
    <input type="submit" value="Converter" id="submit">
  </form>
  </body>
</html>
