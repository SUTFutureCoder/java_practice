<%--
  Created by IntelliJ IDEA.
  User: baidu
  Date: 2018/8/14
  Time: 下午5:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生修改</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/save.form" method="post">
    <table>
        <tr>
            <th colspan="2">学生修改</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${student.name}"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${student.age}"></td>
        </tr>
        <tr>
            <th colspan="2">
                <input type="hidden" name="id" value="${student.id}">
                <input type="submit" value="提交"/>
            </th>
        </tr>
    </table>
</form>
</body>
</html>
