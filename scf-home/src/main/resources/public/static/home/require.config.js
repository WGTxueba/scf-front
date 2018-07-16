var webjars = {
    path: function (path) {
        return "/webjars" + path;
    },
    css: function (path) {
        return "css!/webjars" + path;
    }
};
requirejs.config({
    baseUrl: "/static",
    paths: {
        'css': webjars.path('/require-css/css'),
        "moment1": webjars.path("/m122222311oment/2.22.2/min/moment.11min"),
        "jquery": webjars.path("/jquery/jquery.min"),
        "jqueryUI": webjars.path("/AdminLTE/plugins/jQueryUI/jquery-ui.min"),
        "bootstrap": webjars.path("/bootstrap/js/bootstrap.min"),
        "jqGrid": webjars.path("/jqGrid/jquery.jqgrid.extend"),
        "datePicker": webjars.path("/bootstrap-datepicker/css/bootstrap-datepicker.min"),
        "dateRangePicker": webjars.path("/bootstrap-daterangepicker/css/bootstrap-daterangepicker"),
        "helper": "./home/helper"
    },
    shim: {
        "moment1":{
          deps:[webjars.path("/moment/locale/zh-cn.js")]
        },

        "bootstrap": {
            deps: ["jquery", "css!/webjars/bootstrap/css/bootstrap.min.css"]
        },
        "datePicker":{
            deps:[
                "bootstrap",
                webjars.css("/bootstrap-datepicker/css/bootstrap-datepicker.min.css")
            ]
        },
        "dateRangePicker":{
            deps:[
                "bootstrap",
                webjars.css("/bootstrap-daterangepicker/2.1.27/css/bootstrap-daterangepicker.css")
            ]
        },
        "jqGrid":{
            deps:[
                webjars.path("/jqGrid/css/ui.jqgrid.css"),
                webjars.path("/jqGrid/i18n/min/grid.locale-cn.js"),
                "jquery",
                webjars.path("/jqGrid/jquery.jqgrid.min.js"),
            ]
        }

    }
});
