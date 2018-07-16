<form class="form-horizontal">
    <#if id??>
        <input type="hidden" id="id" name="id" value="${id}" />
    </#if>
    <div class="box-body">
        <div class="col-sm-6">
            <div class="form-group">
                <label for="loginNameElement" class="col-sm-2 control-label">登录名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="loginNameElement" name="loginName" placeholder="请输入登录名">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="nameElement" class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nameElement" name="name" placeholder="姓名">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="sexElement" class="col-sm-2 control-label">性别</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="sexElement" name="sex" placeholder="请输入性别">
                </div>
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
