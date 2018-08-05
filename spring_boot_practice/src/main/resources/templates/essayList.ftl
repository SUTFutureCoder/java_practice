<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图书管理</title>
</head>
<body>
<table>
    <tr>
        <th>essay_id</th>
        <th>essay_title</th>
        <th>essay_content</th>
        <th>content_type</th>
    </tr>
    <#list essayList as essay>
        <tr>
            <td>${essay.essayId}</td>
            <td>${essay.essayTitle}</td>
            <td>${essay.essayContent}</td>
            <td>${essay.contentType}</td>
        </tr>
    </#list>
</table>
</body>
</html>