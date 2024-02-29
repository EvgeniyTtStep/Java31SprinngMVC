<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 29.02.2024
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Firm</title>
</head>
<body>

<h2>Firm</h2>
<div>${firm.idFirm} ${firm.name}</div>

<c:forEach var="developer" items="${developers}">
    <c:out value="${developer.name}"/> <br>
</c:forEach>


</body>
</html>
