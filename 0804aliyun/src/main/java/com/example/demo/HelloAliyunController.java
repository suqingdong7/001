package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAliyunController {

    @RequestMapping("/")
    public String helloAliyun(){

        return "Hello Aliyun!!!";
    }
}