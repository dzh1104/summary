package com.zhding.summary.web;

import com.zhding.summary.bean.PropertiesTestYmlConfig;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestYmlController {

    @Autowired
    private PropertiesTestYmlConfig propertiesTestYmlConfig;

    @ApiOperation(value = "新增的配置文件的信息注入", notes = "定义和使用")
    @GetMapping("/testyml")
    public String test() {
        return propertiesTestYmlConfig.getToString();
    }
}
