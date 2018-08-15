package com.zhding.summary.web;


import com.zhding.summary.bean.PropertiesConfig;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private PropertiesConfig propertiesConfig;

    @ApiOperation(value = "测试自定义属性定义与注入", notes = "定义属性配置类 @Component 引入 和 自动导入 @Autowired，以及使用方式")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        //		return propertiesConfig.getUsername() + ":" + propertiesConfig.getAge();
        return propertiesConfig.getToString();
    }
}
