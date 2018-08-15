package com.zhding.summary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class MyDataSource {

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
