package com.yhtian.springboot.service;

import java.util.concurrent.TimeUnit;

/**
 * @author: yhtian
 * @date: 2021/03/14
 * @description:
 */

class TestData {
    volatile int a = 0;

    public void addTo20 () {
        this.a = 20;
    }
}



public class VolatileDemo {
    public static void main(String[] args) {
        // 新线程修改a
        TestData testData = new TestData();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t start in:" + testData.a);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            testData.addTo20();
            System.out.println(Thread.currentThread().getName() + "\t start in:" + testData.a);
        }, "AAA").start();

        // main thread
        while (testData.a == 0) {

        }

        System.out.println(testData.a);
    }
}
