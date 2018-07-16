package com.bytter.scf.front.sys.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.bytter.scf.core.base.BaseController;

/**
 * <p>
 * 前置单位表 前端控制器
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@Controller
@RequestMapping("/sys/corp")
public class CorpController extends BaseController {

    @GetMapping("/list")
    public String list(){
        return "/sys/corp/list";
    }

    @GetMapping("/add")
    public String add(){
        return "/sys/corp/add";
    }

    @GetMapping("/update/{id:[0-9a-z]{32}}")
    public String update(@PathVariable String id, Model model) {
        logger.debug("update Page, id:{}",id);
        model.addAttribute("id", id);
        return "/sys/corp/update";
    }

}
