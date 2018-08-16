package com.zhding.summary.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 封装配置项

/**
 * 实际项目开发过程中，一般不会使用这种@Value直接引用配置项，而是将其封装起来，已get方法的形式给外部调用，当然我们自己在封装配置项类时，对成员使用@Value也是可以的，不过SpringBoot
 * 给我们提供了一种更方便快捷的封装形式：@ConfigurationProperties
 */
@Component
public class PropertiesConfig {

    @Value("${test.user.username}")
    private String username;

    @Value("${test.user.age}")
    private String age;

    @Value("${test.user.toString}")
    private String toString;

    // ... Getter Setter


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
