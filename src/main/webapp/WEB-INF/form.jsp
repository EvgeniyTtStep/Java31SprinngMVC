<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 24.02.2024
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/developer/form" method="post">
    <input type="text" name="name" placeholder="enter name"> <br>
    <input type="text" name="phone" placeholder="enter phone"> <br>
    <button type="submit">Add developer</button>
</form>

</body>
</html>
