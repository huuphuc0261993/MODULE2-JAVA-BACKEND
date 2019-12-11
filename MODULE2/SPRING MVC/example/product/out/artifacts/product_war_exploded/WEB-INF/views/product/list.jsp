<%--
  Created by IntelliJ IDEA.
  User: nhat
  Date: 4/20/18
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listing product</title>
</head>
<body>
    <h1>Products</h1>
    <p><a href="/new">Add new product</a></p>
    <a href="/products">Home</a>
    <p>There are ${products.size()} products in this list.</p>
<form action="/search" method="post">
    <label>Search:</label>
    <input type="text" name="searchs"/>
    <button>Search</button>
</form>
<table border="1">
        <tr>
            <td>id</td>
            <td>Code</td>
            <td>Name</td>
            <td>Price</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getCode()}</td>
                <td><a href="/view?id=${product.getId()}"> ${product.getName()}</a></td>
                <td>${product.getPrice()}</td>
                <td><a href="/edit?id=${product.id}">Edit</a></td>
            <form method="post" action="delete?id=${product.id}">
                <td><button>Delete</button></td>
            </form>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
