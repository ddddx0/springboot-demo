package com.xxd.boot.bootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/all")
    public String getAll() {
        return "testAll";
    }

    @RequestMapping("/test")
    public String test() {
        return "HelloWorld";
    }

    @GetMapping("/test1")
    public String test1() {
        return "success";
    }
}
