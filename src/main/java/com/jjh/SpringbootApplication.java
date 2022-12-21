package com.jjh; /**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *@ClassName com.jjh.SpringbootApplication
 *@Description TODO
 *@Author jay
 *@version 1.0.0
 */
@SpringBootApplication
@MapperScan("com.jjh.mapper")
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
