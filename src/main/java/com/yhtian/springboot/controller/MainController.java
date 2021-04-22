package com.yhtian.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yhtian
 * @date: 2020/12/02
 * @description: Controller
 * 控制层逻辑代码
 */
@RestController
public class MainController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping({"/", "/index.html"})
    public String index () {
        return "login";
    }
}
