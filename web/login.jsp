<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="vendor/dist/css/bootstrapValidator.css">

    <script type="text/javascript" src="vendor/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="vendor/dist/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="vendor/js/main.js"></script>
</head>
<body>
<div class="container">
    <s:if test="#session.error=='null'">
        <div class="row">
            <div class="col-6 col-lg-offset-3">
                <div id="myAlert2" class="alert alert-warning">
                    <a href="#" class="close" data-dismiss="alert">&times;</a>
                    <strong>警告！</strong>您的网络连接有问题。
                </div>
            </div>
        </div>
    </s:if>
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
            <div class="page-header m">
                <h2>登录</h2>
            </div>

            <form class="form-horizontal" action="loginUser.action" id="login"
                  method="post">
                <div class="form-group">
                    <label class="col-lg-3 control-label">账号:</label>
                    <div class="col-lg-4">
                        <input type="text" class="form-control" name="userEntity.userAccount" placeholder="账号/手机号/姓名"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label">密码:</label>
                    <div class="col-lg-4">
                        <input type="password" class="form-control" name="userEntity.userPasswd" placeholder="密码"
                               onblur="bluree()"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-9 col-lg-offset-3">
                        <button type="submit" class="btn btn-primary" name="login"
                                value="登录">登录
                        </button>
                        <a type="submit" class="btn btn-primary" href="register.jsp">注册</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
