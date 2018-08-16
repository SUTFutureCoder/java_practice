<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: baidu
  Date: 2018/8/14
  Time: 上午11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/student/preSave.form">添加学生</a>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>
                <a href="${pageContext.request.contextPath}/student/preSave.form?id=${student.id}">修改</a>
                &nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/student/delete.form?id=${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
