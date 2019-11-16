<%--
  Created by IntelliJ IDEA.
  User: Little Rabbit
  Date: 2019/11/16
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <div>
           <form method="get" action="/loginServlet">
               <table>
                   <tr>
                       <td>
                           <label>用户名</label>
                       </td>
                       <td>
                           <input type="text" name="username">
                       </td>

                   </tr>
                   <tr>
                       <td>
                           <label>密码</label>
                       </td>
                       <td>
                           <input type="password" name="password">
                       </td>
                   </tr>
                   <tr>
                       <td>
                           <label>验证码</label>
                       </td>
                       <td colspan="2">
                           <input type="text" name="code_str">
                       </td>

                       <td>
                           <img src="/checkimage" alt="验证码">
                       </td>

                   </tr>

               </table>
               <input type="submit" value="登录" >

           </form>



        </div>


</body>
</html>
