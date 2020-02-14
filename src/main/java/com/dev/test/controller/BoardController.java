package com.dev.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("develop")
    public String develop() {
        return "develop";
    }

}
