package com.yhtian.springboot;

import com.yhtian.springboot.service.config.RedissonConfigService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: yhtian
 * @date: 2021/04/09
 * @description:
 */
@SpringBootTest
public class RedissonTest {

    @Autowired
    private RedissonConfigService redissonConfigService;


    @Test
    public void testRedisService() {
        String id = "123121";
        redissonConfigService.testRedissonLock(id);
    }
}
