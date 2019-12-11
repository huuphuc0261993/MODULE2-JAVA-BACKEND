<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 29/11/2019
  Time: 08:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<h1>Caculator</h1>
<form:form action="cal" method="post" modelAttribute="cal">
    <form:label path="num1">Number one:</form:label>
    <form:input type="text" path="num1"/><br>
    <form:label path="num2">Number two:</form:label>
    <form:input type="text" path="num2"/><br>

    <form:button type="submit" name="opera" value="Addition(+)">Addition(+)</form:button>
    <form:button type="submit" name="opera" value="Subtraction(-)">Subtraction(-)</form:button>
    <form:button type="submit" name="opera" value="Multiplication(*)">Multiplication(*)</form:button>
    <form:button type="submit" name="opera" value="Division(/)">Division(/)</form:button>

</form:form>
result=${cal.result}
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</html>
