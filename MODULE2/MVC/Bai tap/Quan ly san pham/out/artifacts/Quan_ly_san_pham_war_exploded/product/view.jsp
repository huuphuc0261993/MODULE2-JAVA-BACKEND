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
    <title>View product</title>
</head>
<body>
<h1>Product deltails</h1>
<p>
    <a href="/products">Back to product list</a>
</p>

    <legend>Product information</legend>
    <table>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>price: </td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>description: </td>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td>manufacturer: </td>
                <td>${requestScope["product"].getManufacturer()}</td>
            </tr>
        </table>
    </table>

</body>
</html>
