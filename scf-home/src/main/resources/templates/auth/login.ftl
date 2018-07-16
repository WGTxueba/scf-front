<html>
<head>
    <#include "/common/head.ftl"/>
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="javascript:void(0)">拜特风控前置系统</a>
    </div>
    <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>

        <form action="${request.contextPath}/auth/loginHandler" method="post">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name="username" value="admin" placeholder="用户名">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="password" placeholder="密码" value="123456">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label class="">
                            <div class="icheckbox_square-blue" aria-checked="false" aria-disabled="false" style="position: relative;"><input type="checkbox" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div> Remember Me
                        </label>
                    </div>
                </div>
                <div class="col-xs-4">
                    <button type="button" id="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
            </div>
        </form>

        <a href="#">忘记密码？</a><br>
        <a href="register.html" class="text-center">注册</a>

    </div>
</div>
<#include "/common/foot.ftl"/>
<script type="text/javascript">
    $(function () {
        $('button[id="submit"]').click(function () {
            var data = $('form').serializeObject();
            $.ajax({
                url: basePath + "/auth/loginHandler",
                type: "post",
                dataType: "json",
                data: data,
                success: function(data){
                    // console.log(data);
                    // alert("登录成功！");
                    location.href = basePath + "/";
                },
                error:function(jqXHR, status, error){
                    console.log(jqXHR.responseJSON);
                    alert("登录失败:"+jqXHR.responseJSON.content);
                }
            });
        });
    });
</script>
</body>
</html>
