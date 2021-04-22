package com.yhtian.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: yhtian
 * @date: 2021/04/09
 * @description:
 */
@Data
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {
    private String host;
    private String port;
    private String password;
    private String database;
    private String timeout;

}
