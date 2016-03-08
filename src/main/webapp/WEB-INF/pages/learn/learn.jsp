<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm</title>
</head>

<body>
<h3>------------ s3 Shiro-------------------</h3>
<div>
    <a href="${pageContext.request.contextPath}/learn/logout"> 登出</a>&nbsp;|&nbsp;
</div>

<P></P>
<P></P>
<h3>------------ s2 Mybatis-------------------</h3>
<div>

<a href="${pageContext.request.contextPath}/learn/mybatis/get/1">用户1</a>&nbsp;|&nbsp;
<a href="${pageContext.request.contextPath}/learn/mybatis/get/2">用户2</a>&nbsp;|&nbsp;
<a href="${pageContext.request.contextPath}/learn/mybatis/get/3">用户3</a>&nbsp;|&nbsp;
</div>

<P></P>
<P></P>

<h3>------------ s1 SpringMVC-------------------</h3>

<div>
    <a href="${pageContext.request.contextPath}/learn/mvc/json"> 直接返回json</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/mvc/cn">产生乱码的解决</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/mvc/map">传参</a>&nbsp;|&nbsp;
</div>
<P></P>
<div >
    <a href="${pageContext.request.contextPath}/learn/log">log</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/log/debug">debug</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/log/error">error</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/learn/log/exception">异常抛出</a>&nbsp;|&nbsp;
</div>
<P></P>
<div>
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
