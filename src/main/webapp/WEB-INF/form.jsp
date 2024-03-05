<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 24.02.2024
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/developer/form" method="post">
    <input type="text" name="idDeveloper" value="${developer.idDeveloper}" hidden> <br>
    <input type="text" name="name" value="${developer.name}" placeholder="enter name"> <br>
    <input type="text" name="phone" value="${developer.phone}" placeholder="enter phone"> <br>

    <c:if test="${developer == null}">
        <button type="submit">Add developer</button>
    </c:if>
    <c:if test="${developer != null}">
        <button type="submit">Update developer</button>
    </c:if>
</form>

</body>
</html>
