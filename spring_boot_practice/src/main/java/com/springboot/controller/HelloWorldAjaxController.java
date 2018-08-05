package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController {

    @RequestMapping("/hello")
    public String say() {
        return "{\"message1\":\"SpringBoot你好\", \"message2\":\"还是Golang爽\"}";
    }

}
