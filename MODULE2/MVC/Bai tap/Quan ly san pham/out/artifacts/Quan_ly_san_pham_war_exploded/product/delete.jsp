<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 06/11/2019
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/products">Back to product</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
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
                <tr>
                    <td><input type="submit" value="Delete product"></td>
                    <td><a href="/products">Back to customer list</a></td>
                </tr>
            </table>
        </table>
    </fieldset>
</form>
</body>
</html>
