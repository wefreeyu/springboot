package com.yhtian.springboot.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yhtian
 * @date: 2021/04/13
 * @description:
 */
public class HashMapTest {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        System.out.println("减一：" + n);
        System.out.println("二进制：" + Integer.toBinaryString(n));
        n |= n >>> 1;
        System.out.println("右移1位：" + Integer.toBinaryString(n));
        n |= n >>> 2;
        System.out.println("右移2位：" + Integer.toBinaryString(n));
        n |= n >>> 4;
        System.out.println("右移4位：" + Integer.toBinaryString(n));
        n |= n >>> 8;
        System.out.println("右移8位：" + Integer.toBinaryString(n));
        n |= n >>> 16;
        System.out.println("右移16位：" + Integer.toBinaryString(n));
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void main(String[] args) {
        Map <String, Object> map = new HashMap<>();
//        System.out.println(tableSizeFor(5));
        System.out.println(-3 >> 2);
    }
}
