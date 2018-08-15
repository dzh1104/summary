package com.zhding.summary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan

/**
 * 1) @SpringBootConfiguration = @Configuration = @Component 在Spring中@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
 * 当@ComponentScan扫描到该注解时，加入到Spring容器中，类似的注解除了@Component，还有@Service，@Controller，@Repository等。
 * 2) @ComponentScan 指定注解扫描地址，默认为该类同级路径。即能扫描到本项目中web包下面的UserController的@RestController注解
 * 3) @EnableAutoConfiguration 注解用来自动配置，我们pom中配置了 spring-boot-starter-web，所以spring会来创建一
 * 个web应用来配置程序，也就是根据依赖jar，自动进行装配操作，同样，如果Pom中或者加入了mysql jdbc 包，那么会自动去构建一个数据库配置，如果你在application.properties/
 * .yml中没有配置mysql jdbc，那么启动会报错，如果引入了相关jar包，但是需要springboot不自动配置，那么需要配置exclude 比如：@EnableAutoConfiguration(exclude={
 * DataSourceAutoConfiguration.class})
 */
@SpringBootApplication
public class SummaryApplication {

    public static void main(String[] args) {

        SpringApplication.run(SummaryApplication.class, args);
    }

}
