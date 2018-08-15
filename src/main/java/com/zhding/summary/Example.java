package com.zhding.summary;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    //    需要指定访问的方式，否则会导致其中一个影响就是swagger2显示所有的方法
    //    @RequestMapping("/example")
    @GetMapping("/example")
    public String home() {

        return "Hello Spring Boot! To be starter!";
    }

}