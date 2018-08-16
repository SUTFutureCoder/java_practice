<%--
  Created by IntelliJ IDEA.
  User: baidu
  Date: 2018/8/14
  Time: 下午6:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/ajax.form">测试ajax</a>
<form action="${pageContext.request.contextPath}/user/login.form" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
