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
    <c:out value="${developer.name} ${developer.phone}"/> <br>
</c:forEach>


</body>
</html>
