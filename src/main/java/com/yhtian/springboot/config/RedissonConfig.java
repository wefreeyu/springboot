package com.yhtian.springboot.config;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yhtian
 * @date: 2021/04/09
 * @description: RedissonConfig
 * Redis分布式锁
 */
@Configuration
public class RedissonConfig {

    @Bean
    public Redisson redisson () {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:3306").setDatabase(0);
        return (Redisson)Redisson.create(config);
    }
}
