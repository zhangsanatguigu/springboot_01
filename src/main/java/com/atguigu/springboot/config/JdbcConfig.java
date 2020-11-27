package com.atguigu.springboot.config;

import com.atguigu.springboot.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootConfiguration //@Configureation
public class JdbcConfig {


    @Bean //在IOC容器中声明一个bean对象。等价于<bean id="方法名称" class="xx.DataSourceProperties3">
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties3 dataSourceProperties3(){
        return new DataSourceProperties3();
    }

}
