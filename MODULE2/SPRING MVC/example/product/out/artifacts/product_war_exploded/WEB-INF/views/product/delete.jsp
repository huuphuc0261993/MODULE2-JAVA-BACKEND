<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 25/11/2019
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Delete product</h1>
<table>
    <a href="/products">Back to product list</a>
    <form:form action="delete?id=${product.id}" method="post" modelAttribute="product">
    <table>
    <tr>
        <td>Code: </td>
        <td>${product.code}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${product.price}</td>
    </tr>
    <tr>
       <td><form:button>Delete</form:button></td>
    </tr>
    </table>

</form:form>
</table>
</body>
</html>
