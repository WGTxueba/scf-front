package com.bytter.scf.front.demo.controller;

import com.bytter.scf.core.base.BaseController;
import com.bytter.scf.core.factory.FeignClientFactory;
import com.bytter.scf.core.utils.StringUtils;
import com.bytter.scf.front.demo.client.DemoClient;
import com.bytter.scf.front.demo.entity.Demo;
import com.bytter.scf.front.demo.entity.enums.DemoSexEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * demo的页面跳转
 */
@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @Autowired
    private DemoClient demoClient;

    @GetMapping("/list")
    public String list() {
        return "/demo/list";
    }

    @GetMapping("/add")
    public String add() {
        return "/demo/add";
    }

    @GetMapping("/update/{id:[0-9a-z]{32}}")
    public String update(@PathVariable String id, Model model) {
        logger.debug("update Page, id:{}", id);
        model.addAttribute("id", id);
        return "/demo/update";
    }

    @GetMapping("/currentUser")
    @ResponseBody
    public Object currentUser(Principal principal){
        return principal;
    }


    @Autowired
    private FeignClientFactory feignFactory;

    /**
     * 测试Feign接口是否正常
     * @return
     */
    @GetMapping("/testFeign")
    @ResponseBody
    public Object testFeign() throws Exception {
        DemoClient demoClient = feignFactory.get(DemoClient.class,"http://127.0.0.1:8080");
//        ReflectiveFeign reflectiveFeign = (ReflectiveFeign) demoClient;
        Demo demo = new Demo();
        demo.setName("周亮");
        demo.setLoginName("zhoul");
        demo.setSex(DemoSexEnum.MAN);
        Demo insert = demoClient.insert(demo);
        if(StringUtils.isNotBlank(insert.getId())){
            logger.info("插入成功！{}",demo);
        }

        Demo demo1 = demoClient.get(insert.getId());
        demo1.setName("周亮1");
        Demo update = demoClient.update(demo1);
        if(update.getName().equals("周亮1")){
            logger.info("修改成功！{}",demo);
        }

        demoClient.delete(demo1.getId());
        logger.info("删除成功！{}");
        return "ok";

    }
}
