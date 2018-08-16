package com.zhding.summary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 封装配置项

/**
 * 实际项目开发过程中，一般不会使用这种@Value直接引用配置项，而是将其封装起来，已get方法的形式给外部调用，当然我们自己在封装配置项类时，对成员使用@Value也是可以的，不过SpringBoot
 * 给我们提供了一种更方便快捷的封装形式：@ConfigurationProperties
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class MyDataSource {

//    仍然可以使用@Value
    @Value("${girl.cupSize}")
    private String cupSize;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    //    @Value("${spring.datasource.password}")
    private String password;

    //    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    //    提供Setter 和 Getter 方法
    public String getCupSize() {

        return cupSize;
    }

    public void setCupSize(String cupSize) {

        this.cupSize = cupSize;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getDriverClassName() {

        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {

        this.driverClassName = driverClassName;
    }

}
