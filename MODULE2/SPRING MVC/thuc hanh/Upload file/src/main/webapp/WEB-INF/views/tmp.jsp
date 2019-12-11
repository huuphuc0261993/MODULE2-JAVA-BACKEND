<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 02/12/2019
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Upload File</h1>
<form method="POST" action="/upload" enctype="multipart/form-data">
    <table>
    <tr>
    <td><label path="file">Select a file to upload</label></td>
    <td><input type="file" name="file" /></td>
    </tr>
    <tr>
    <td><input type="submit" value="Submit" /></td>
    </tr>
    </table>
    </form>
</body>
</html>
