package com.zhding.summary.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource(value = "classpath:test.yml")
@ConfigurationProperties(prefix = "test.user")
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
