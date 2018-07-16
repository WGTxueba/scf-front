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
                <label for="netIdElement" class="col-sm-2 control-label">所属网点</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="netIdElement" name="netId" placeholder="请输入所属网点">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="corpCodeElement" class="col-sm-2 control-label">单位代码</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="corpCodeElement" name="corpCode" placeholder="请输入单位代码">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="corpNameElement" class="col-sm-2 control-label">单位名称</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="corpNameElement" name="corpName" placeholder="请输入单位名称">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="parentIdElement" class="col-sm-2 control-label">上级单位</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="parentIdElement" name="parentId" placeholder="请输入上级单位">
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="form-group">
                <label for="typeElement" class="col-sm-2 control-label">单位类型</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="typeElement" name="type" placeholder="请输入单位类型">
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
        <div class="col-sm-6">
            <div class="form-group">
                <label for="enterIdElement" class="col-sm-2 control-label">核心企业ID</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="enterIdElement" name="enterId" placeholder="请输入核心企业ID">
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
