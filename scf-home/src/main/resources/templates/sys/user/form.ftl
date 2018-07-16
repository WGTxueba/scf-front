<form class="form-horizontal">
    <#if id??>
    <input type="hidden" id="id" name="id" value="${id}">
    </#if>
    <div class="box-body">
        <div class="col-sm-6">
            <div class="form-group">
                <label for="idElement" class="col-sm-2 control-label">主键ID</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="idElement" name="id" placeholder="请输入主键ID">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="userCodeElement" class="col-sm-2 control-label">用户代码</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="userCodeElement" name="userCode" placeholder="请输入用户代码">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="userNameElement" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="userNameElement" name="userName" placeholder="请输入用户名">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="passwordElement" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="passwordElement" name="password" placeholder="请输入密码">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="saltElement" class="col-sm-2 control-label">盐</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="saltElement" name="salt" placeholder="请输入盐">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="corpIdElement" class="col-sm-2 control-label">单位ID</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="corpIdElement" name="corpId" placeholder="请输入单位ID">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="statusElement" class="col-sm-2 control-label">状态</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="statusElement" name="status" placeholder="请输入状态">
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
