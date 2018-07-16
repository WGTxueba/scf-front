package com.bytter.scf.front.config;

import com.bytter.scf.core.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * demo的页面跳转
 */
@Controller
@RequestMapping("/")
public class HomeController extends BaseController{

    @GetMapping("/index")
    public void index(){

//        UserDetails userDetails = getUserDetails();
//        logger.info("用户名为：{}",userDetails.getUsername());
//        logger.info("密码为：{}",userDetails.getPassword());
    }

}
