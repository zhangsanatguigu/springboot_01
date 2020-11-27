package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.DataSourceProperties;
import com.atguigu.springboot.bean.DataSourceProperties2;
import com.atguigu.springboot.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController //  等价于@Controller + @ResponseBody
//@Controller
@EnableConfigurationProperties(JdbcProperties.class)
public class HelloController {

    @Autowired
    DataSourceProperties dataSourceProperties;

    //@Autowired
    //DataSourceProperties2 dataSourceProperties2;

    @Autowired
    JdbcProperties jdbcProperties;

    @Value("${server.port}")
    String port;

    @Autowired
    DataSource dataSource;

    //@ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        //System.out.println(dataSourceProperties);
        //System.out.println(dataSourceProperties2);
        //System.out.println(jdbcProperties);

        //System.out.println("port = " + port);

        System.out.println("========"+dataSource);

        return "Hello,SpringBoot!!!";
    }


}
