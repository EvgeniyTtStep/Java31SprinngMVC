<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 24.02.2024
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="developer" items="${developers}">
    <c:if test="${developer.phone.equals('333')}">
        <div style="color: aqua">${developer.name} ${developer.phone} <a href="/single/developer/${developer.phone}">developer</a></div>
    </c:if>
    <c:if test="${!developer.phone.equals('333')}">
        <div style="color: coral">${developer.name} ${developer.phone} <a href="/single/developer/${developer.phone}">developer</a></div>
    </c:if>
</c:forEach>

<br>

<c:forEach var="firm" items="${firms}">
    <div>${firm.name} <a href="/single/firm/${firm.idFirm}">firm</a></div>
</c:forEach>


<br>

<a href="/developer/form">Add developer</a>

</body>
</html>
