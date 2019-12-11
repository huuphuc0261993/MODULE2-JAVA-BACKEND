<%--
  Created by IntelliJ IDEA.
  User: phuc
  Date: 05/11/2019
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));

    float vnd = rate*usd;

%>
<c:set var="tien" value="${vnd}"/>
<c:out value="${tien}"/>
<c:choose>
    <c:when test="${tien != null}">
        <h1>VND: <c:out value="${tien}"/></h1>
    </c:when>
    <c:otherwise>
        Not found....
    </c:otherwise>
</c:choose>
<%--<%--%>
<%--    float rate = Float.parseFloat(request.getParameter("rate"));--%>
<%--    float usd = Float.parseFloat(request.getParameter("usd"));--%>

<%--    float vnd = rate * usd;--%>
<%--%>--%>
<%--<h1>Rate: <%=rate%></h1>--%>
<%--<h1>USD: <%=usd%></h1>--%>
<%--<h1>VND: <%=vnd%></h1>--%>

</body>
</html>
