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
                <label for="typeElement" class="col-sm-2 control-label">类型0数据中心、1资金系统</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="typeElement" name="type" placeholder="请输入类型0数据中心、1资金系统">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="nameElement" class="col-sm-2 control-label">配置名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nameElement" name="name" placeholder="请输入配置名">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="valueElement" class="col-sm-2 control-label">配置值</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="valueElement" name="value" placeholder="请输入配置值">
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
