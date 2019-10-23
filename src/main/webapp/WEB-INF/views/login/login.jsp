<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2019/10/22
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="dowebok">
    <div class="logo"></div>
    <form action="login" accept-charset="utf-8" id="login_form" class="loginForm" method="post">

        <div class="form-item">
            <input id="username" name="username" type="text" autocomplete="off" placeholder="账号/工号">
            <!--  -->
        </div>
        <div class="form-item">
            <input id="password" name="password" type="password" autocomplete="off" placeholder="登录密码">
            <!--   -->
        </div>
        <div class="form-item"><button id="submit">登 录</button></div>
        <div class="reg-bar">
            <a class="reg" href="javascript:">立即注册</a>
            <a class="forget" href="javascript:">忘记密码</a>
        </div>
    </form>
</div>

</body>
</html>
