package com.yanan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/home")
    public String home(){

        StringBuffer str = new StringBuffer();
        str.append("hello ");
        str.append("!");

        return str.toString();
    }
}
