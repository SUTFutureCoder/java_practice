<%--
  Created by IntelliJ IDEA.
  User: baidu
  Date: 2018/8/14
  Time: 下午11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ArticleList</title>
</head>
<body>
<table>
    <tr>
        <th colspan="2">
            <img alt="文章列表" src="${pageContext.request.contextPath}/resources/v2-fec0357c6b44e5b7761bf2c1337bef3d_hd.jpg"/>
        </th>
    </tr>
    <tr>
        <td>1</td>
        <td>
            <a href="${pageContext.request.contextPath}/article/details/1" target="_blank">文章1</a>
        </td>
    </tr>
    <tr>
        <td>2</td>
        <td>
            <a href="${pageContext.request.contextPath}/article/details/2" target="_blank">文章2</a>
        </td>
    </tr>
</table>
</body>
</html>
