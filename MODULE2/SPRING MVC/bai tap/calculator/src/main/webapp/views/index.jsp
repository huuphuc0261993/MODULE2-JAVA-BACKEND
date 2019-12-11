<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 26/11/2019
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form:form id="calculator" action="cal" method="post" modelAttribute="cal">
    <form:label path="num1">Number one:</form:label>
    <form:input path="num1"/> <br>
    <form:label path="num2">Number two:</form:label>
    <form:input path="num2"/>
    <br><br>

<%--    <select name="rs" onchange="document.getElementById('calculator').submit()">--%>
<%--        <option value="#" selected>${result.cal}</option>--%>
<%--        <option value="Addition(+)">Addition(+)</option>--%>
<%--        <option value="Subtraction(-)">Subtraction(-)</option>--%>
<%--        <option value="Multiplication(*)">Multiplication(*)</option>--%>
<%--        <option value="Division(/)">Division(/)</option>--%>
<%--    </select>--%>

<%--    <button type="submit">Result</button>--%>
   <form:button type="submit" value="Addition(+)" name="opera">Addition(+)</form:button>
   <form:button type="submit" value="Subtraction(-)" name="opera">Subtraction(-)</form:button>
   <form:button type="submit" value="Multiplication(*)" name="opera">Multiplication(*)</form:button>
   <form:button type="submit" value="Division(/)" name="opera">Division(/)</form:button>
</form:form>

<%--<form id="calculator" action="cal" method="post" modelAttribute="calculator">--%>
<%--    <input type="text" name="num1"  value="${result.num1}">--%>
<%--    <input type="text" name="num2"  value="${result.num2}">--%>
<%--    <br><br>--%>

<%--    &lt;%&ndash;    <select name="rs" onchange="document.getElementById('calculator').submit()">&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <option value="#" selected>${result.cal}</option>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <option value="Addition(+)">Addition(+)</option>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <option value="Subtraction(-)">Subtraction(-)</option>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <option value="Multiplication(*)">Multiplication(*)</option>&ndash;%&gt;--%>
<%--    &lt;%&ndash;        <option value="Division(/)">Division(/)</option>&ndash;%&gt;--%>
<%--    &lt;%&ndash;    </select>&ndash;%&gt;--%>

<%--    &lt;%&ndash;    <button type="submit">Result</button>&ndash;%&gt;--%>
<%--    <fbutton type="submit" value="Addition(+)" name="opera">Addition(+)</fbutton>--%>
<%--    <button type="submit" value="Subtraction(-)" name="opera">Subtraction(-)</button>--%>
<%--    <button type="submit" value="Multiplication(*)" name="opera">Multiplication(*)</button>--%>
<%--    <button type="submit" value="Division(/)" name="opera">Division(/)</button>--%>
<%--</form>--%>
result = ${result.result}
</body>
</html>
