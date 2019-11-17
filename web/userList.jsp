<%--
  Created by IntelliJ IDEA.
  User: Little Rabbit
  Date: 2019/11/17
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>tiel</title>
</head>
<body>

        <table>
            <tr>
                <th>
                    id
                </th>
                <th>
                    name
                </th>
                <th>
                    gender
                </th>
                <th>
                    age
                </th>
                <th>
                    address
                </th>
                <th>
                    qq
                </th>
                <th>
                    email
                </th>
            </tr>

                <c:forEach var="user" items="${userlist}" begin="0" end="${userlist}">
                        <tr>
                            <td>${user.name}</td>
                            <td>${user.name}</td>
                            <td>${user.name}</td>
                            <td>${user.name}</td>
                            <td>${user.name}</td>
                            <td>${user.name}</td>
                            <td>${user.name}</td>
                        </tr>

                </c:forEach>


        </table>


</body>
</html>
