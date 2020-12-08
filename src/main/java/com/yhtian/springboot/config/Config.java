package com.yhtian.springboot.config;

import com.yhtian.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yhtian
 * @date: 2020/12/08
 * @description: Config
 * Config配置类
 */
@Configuration
public class Config {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
