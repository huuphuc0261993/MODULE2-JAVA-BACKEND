<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 06/11/2019
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new customer</a>
</p>

<form method="post" action="products">
    <input type="text" name="findName" placeholder="Enter your name: ">
    <input type="text" name="action" value="findName1" hidden>
    <input type="submit" value="Search" name="submit">
</form>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufacturer</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>View</td>
    </tr>
<c:forEach items='${requestScope["products"]}' var="product">
    <tr>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
        <td>${product.getDescription()}</td>
        <td>${product.getManufacturer()}</td>
        <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
        <td><a href="/products?action=delete&id=${product.getId()}">delete</a> </td>
        <td><a href="/products?action=view&id=${product.getId()}">view</a> </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
