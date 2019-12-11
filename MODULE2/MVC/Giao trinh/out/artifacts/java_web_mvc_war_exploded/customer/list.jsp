<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 06/11/2019
  Time: 05:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customers?action=create">Create new customer</a>
</p>
<%--tao paramater--%>
<form method="post" action="/customers">
<input type="text" name="findName" placeholder="Enter your name: ">
<input type="submit" value="Search" name="submit">
<input type="text" name="action" value="findName" hidden>
</form>
<table border="1">

    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>View</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
            <td><a href="/customers?action=view&id=${customer.getId()}">View</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
