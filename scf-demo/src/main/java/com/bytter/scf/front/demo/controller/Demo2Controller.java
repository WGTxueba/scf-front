package com.bytter.scf.front.demo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.bytter.scf.core.base.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenlj
 * @since 2018-07-09
 */
@Controller
@RequestMapping("/demo/demo2")
public class Demo2Controller extends BaseController {

    @GetMapping("/list")
    public String list(){
        return "/demo/list2";
    }

    @GetMapping("/add")
    public String add(){
        return "/demo/add2";
    }

    @GetMapping("/update/{id:[0-9a-z]{32}}")
    public String update(@PathVariable String id, Model model) {
        logger.debug("update Page, id:{}",id);
        model.addAttribute("id", id);
        return "/demo/update2";
    }

}
