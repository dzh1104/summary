package com.zhding.summary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController == @Controller + @ResponseBody
@RestController
public class HelloWorldController {

    @Autowired
    private MyDataSource myDataSource;

    @RequestMapping(value = "/hello")
    public String index() {

        return "Hello World!" + myDataSource.getCupSize() + myDataSource.getUrl();

    }
}
