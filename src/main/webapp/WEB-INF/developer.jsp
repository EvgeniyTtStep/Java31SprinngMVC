<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 27.02.2024
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Developer</title>
</head>
<body>

<h2>Developer ${dev.name} ${dev.phone}</h2>
<h3>Firm name: <c:out value="${dev.firm.name}"/></h3>
<h3>Skills</h3>
<c:forEach var="skill" items="${skills}">
    <c:out value="${skill.name}"/> <br>
</c:forEach>


</body>
</html>
