<script  src="${request.contextPath}/webjars/jquery/jquery.min.js"></script>
<script  src="${request.contextPath}/webjars/bootstrap/js/bootstrap.min.js"></script>
<script  src="${request.contextPath}/webjars/AdminLTE/dist/js/adminlte.min.js"></script>
<script  src="${request.contextPath}/static/home/main.js"></script>
<script>
    $(function(){
        $(window).on('resize', function () {
            var content = $('.content-wrapper');
            $('iframe[id="mainPage"]').height(content.innerHeight()-5);
        }).resize();
    });
</script>
