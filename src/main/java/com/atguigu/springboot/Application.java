package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootConfiguration 等价于@Configuration
 * @EnableAutoConfiguration 框架底层提供了大量配置类，框架根据项目运行环境来决定哪些配置生效
 *
 * 启动服务器时，SpringApplication构造器，执行初始化操作，加载类路径中META-INF/spring.factories文件（扫描所有jar包中的文件）。
 * 找org.springframework.boot.autoconfigure.EnableAutoConfiguration属性，获取124个配置类
 * XXXConfiguration  每一个配置类往往对应一个 XxxProperties属性类
 * 配置类是否生效@ConditionalOnXxx注解进行条件判断
 *
 *
 * @ComponentScan 默认扫描主程序所在的包以及子包
 */
@SpringBootApplication //声明当前应用为SpringBoot应用
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
