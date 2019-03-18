<%--
  Created by IntelliJ IDEA.
  UserEntity: Administrator
  Date: 2019/3/14
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="vendor/dist/css/bootstrapValidator.css">

    <script type="text/javascript" src="vendor/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="vendor/dist/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="vendor/js/main.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
            <div class="page-header">
                <h2>注册</h2>
            </div>

            <form id="defaultForm" method="post" class="form-horizontal" action="registerUser.action">
                <div class="form-group">
                    <label class="col-lg-3 control-label">姓名:</label>
                    <div class="col-lg-5">
                        <input type="text" class="form-control" name="userEntity.userName"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-lg-3 control-label">手机号:</label>
                    <div class="col-lg-5">
                        <input type="text" class="form-control" name="userEntity.userMobile"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-lg-3 control-label">输入密码:</label>
                    <div class="col-lg-5">
                        <input type="password" class="form-control" name="userEntity.userPasswd"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-lg-3 control-label">再次输入密码:</label>
                    <div class="col-lg-5">
                        <input type="password" class="form-control" name="confirmPassword"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-9 col-lg-offset-3">
                        <button type="submit" class="btn btn-primary" name="sign up" value="Sign up">注册</button>
                        <a class="btn btn-primary" href="login.jsp">返回</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
