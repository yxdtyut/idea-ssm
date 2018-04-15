<%--
  Created by IntelliJ IDEA.
  User: yangxudong
  Date: 2018/4/15
  Time: 上午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/addCustomer" method="post">
        客户姓名:<input type="text" name="name" > <br/>
        客户年龄:<input type="text" name="age" > <br/>
        客户性别:<input type="text" name="sex" > <br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
