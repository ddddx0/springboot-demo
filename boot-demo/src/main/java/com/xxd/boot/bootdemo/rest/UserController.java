package com.xxd.boot.bootdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/all")

    public String getAll() {
        return "testAll";
    }

    @RequestMapping("/test2")
    public String test(){
        return "HelloWorld";
    }
}
