<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm</title>
</head>

<body>


<div style="float: left;clear: both">
    <h3>------------ step-03 REST风格的url映射-------------------</h3>

    <a href="${pageContext.request.contextPath}/learn/mvc/json"> 直接返回json</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/mvc/cn">产生乱码的解决</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/mvc/map">传参</a>&nbsp;|&nbsp;

    <br>
    <a href="${pageContext.request.contextPath}/learn/log">log</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/log/debug">debug</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/log/error">error</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/log/exception">异常抛出</a>&nbsp;|&nbsp;
    <br>

    <form action="${pageContext.request.contextPath}/learn/rest/1" method="get">
        <button type="submit">获取-get</button>
    </form>
    <form action="${pageContext.request.contextPath}/learn/rest/" method="post">
        <button type="submit">新增POST</button>
    </form>
    <form action="${pageContext.request.contextPath}/learn/rest/1" method="post">
        <input type="hidden" name="_method" value="put"/>
        <button type="submit">修改PUT</button>
    </form>
    <form action="${pageContext.request.contextPath}/learn/rest/1" method="post">
        <input type="hidden" name="_method" value="delete"/>
        <button type="submit">删除DELETE</button>
    </form>
</div>


</body>
</html>
