package com.zhding.summary.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
// YAML的缺点：不能通过@PropertySource注解加载。如果需要使用@PropertySource注解的方式加载值，那就要使用properties文件
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "test2.user")
public class PropertiesTestYmlConfig {

    private String username;

    private String age;

    private String toString;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getAge() {

        return age;
    }

    public void setAge(String age) {

        this.age = age;
    }

    public String getToString() {

        return toString;
    }

    public void setToString(String toString) {

        this.toString = toString;
    }

}
