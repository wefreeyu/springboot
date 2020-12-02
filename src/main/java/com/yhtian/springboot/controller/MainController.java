package com.yhtian.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: yhtian
 * @date: 2020/12/02
 * @description: Controller
 * 控制层逻辑代码
 */
@Controller
public class MainController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}
