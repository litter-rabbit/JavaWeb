<%--
  Created by IntelliJ IDEA.
  User: Little Rabbit
  Date: 2019/11/16
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

    <h1><%= request.getSession().getAttribute("username")%>登录成功</h1>

</body>
</html>
