package com.test.demoWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody  or use RestController at top
    public String greet(){
        return "Hello";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
