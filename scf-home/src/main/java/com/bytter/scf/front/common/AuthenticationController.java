package com.bytter.scf.front.common;

import com.bytter.scf.core.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/auth")
public class AuthenticationController extends BaseController {


    @GetMapping("/login")
    public void login(){

    }

}
