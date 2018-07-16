<html>
<head>
    <#include "/common/head.ftl"/>
</head>
<body>
<section class="content-header">
    <h1>演示
        <small>新增</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li><a href="#">演示</a></li>
        <li class="active">新增</li>
    </ol>
</section>
<section class="content">
    <div class="box box-default color-palette-box">
        <#include "./form2.ftl"/>
    </div>
</section>
<#include "/common/foot.ftl"/>
<script type="text/javascript">
    $(function () {
        var id = $('input[id="id"]').val();
        $.btGet(basePath + "/api/demo/" + id, {}, function (data) {
            $('#loginNameElement').val(data.loginName);
            $('#nameElement').val(data.name);
            $('#sexElement').val(data.sex);
        });
        $('button[id="submit"]').click(function () {
            var data = $('form').serializeObject();
            $.btPut(basePath + "/api/demo/demo2",data,function(res){
                alert("修改数据成功");
            },function(jqXHR, status, error){
                alert("修改数据失败");
            });
        });
    });
</script>
</body>
</html>
