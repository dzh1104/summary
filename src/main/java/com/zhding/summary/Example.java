package com.zhding.summary;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/example")
    public String home() {
        return "Hello Spring Boot! To be starter!";
    }

}