package com.yhtian.springboot.service.config;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: yhtian
 * @date: 2021/04/09
 * @description: RedissonConfigService
 * redis分布式锁测试
 */
@Service
public class RedissonConfigService {

    @Autowired
    private RedissonClient redisson;

    public void testRedissonLock(String id) {

        RLock redisLock = null;

        try {
            redisLock = redisson.getLock("lock_" + id);
            redisLock.tryLock(1, 2, TimeUnit.SECONDS);
            redisLock.tryLock(2, TimeUnit.SECONDS);
            redisLock.lock(10, TimeUnit.SECONDS);
            
            System.out.println("加分布式锁");

            // 业务代码
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            redisLock.unlock();
            System.out.println("释放锁");
        }

        System.out.println("yes");

    }
}
