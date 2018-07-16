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
        <div class="box-header">
            <h3 class="box-title">企e金服云端风控系统</h3>
        </div>
        <form class="form-horizontal" id="qejfForm">
            <div class="box-body">
                <div class="form-group">
                    <label for="systemElement" class="col-sm-2 control-label">系统标识</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="systemElement" name="qejf.systemTag" placeholder="请输入系统标识">
                    </div>
                </div>
                <div class="form-group">
                    <label for="customerElement" class="col-sm-2 control-label">客户标识</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="customerElement" name="qejf.customerTag" placeholder="请输入客户标识">
                    </div>
                </div>
                <div class="form-group">
                    <label for="serverAddressElement" class="col-sm-2 control-label">系统服务器地址</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="serverAddressElement" name="qejf.dcServerAddress" placeholder="请输入系统服务器地址">
                    </div>
                </div>
            </div>
            <div class="box-footer">
                <div class="pull-right">
                    <div class="btn-group ">
                        <button type="button" id="submit" class="btn btn-info">提交</button>
                    </div>
                    <div class="btn-group ">
                        <button type="button" id="cancel" class="btn btn-default" onclick="history.back();">取消</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>
<#include "/common/foot.ftl"/>
<script type="text/javascript">
    $(function () {
        $.btGet(basePath + "/api/sys/param/", {}, function (datas) {
            for(var i=0;i<datas.length;i++){
                var data = datas[i];
                $('[name="'+data.type +'.'+data.name+'"]').val(data.value);
            }
        });
        $('button[id="submit"]').click(function () {
            var data = $('form[id="qejfForm"]').serializeArray();
            var sendData = [];
            for(var i=0;i<data.length;i++){
                var d = data[i];
                var typeAndName = d.name;
                var arr = typeAndName.split(".");
                var obj = {
                    type:arr[0],
                    name:arr[1],
                    value:d.value
                };
                var flag = true;
                for(var j=0;j<sendData.length;j++){
                  var sd = sendData[j];
                  if(sd === obj){
                      flag = false;
                      break;
                  }
                }
                if(flag){
                    sendData.push(obj)
                }
            }
            $.btPut(basePath + "/api/sys/param", sendData, function (res) {
                alert("修改数据成功");
            }, function (jqXHR, status, error) {
                alert("修改数据失败");
            });
        });
    });
</script>
</body>
</html>
