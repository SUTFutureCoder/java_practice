package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/freemarker")
public class HelloWorldFreemarkerController {


    @RequestMapping("/say")
    public ModelAndView say() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "springboot你好!");
        mav.setViewName("helloWorld");
        return mav;
    }

}
