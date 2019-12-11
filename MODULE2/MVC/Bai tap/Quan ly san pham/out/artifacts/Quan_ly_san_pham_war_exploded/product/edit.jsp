<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"]!=null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product</a>
</p>
<p>
    <form method="get">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
                </tr>
                <tr>
                    <td>price: </td>
                    <td><input type="text" name="price" id="price" value="${requestScope["product"].getPrice()}"></td>
                </tr>
                <tr>
                    <td>description: </td>
                    <td><input type="text" name="description" id="description" value="${requestScope["product"].getDescription()}"></td>
                </tr>
                <tr>
                    <td>manufacturer: </td>
                    <td><input type="text" name="manufacturer" id="manufacturer" value="${requestScope["product"].getManufacturer()}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update product"></td>
                </tr>
            </table>
        </table>
    </fieldset>
</form>
</p>
</body>
</html>
