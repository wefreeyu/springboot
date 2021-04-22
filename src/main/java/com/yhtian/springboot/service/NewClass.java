package com.yhtian.springboot.service;

/**
 * @author: yhtian
 * @date: 2021/04/12
 * @description:
 */
public class NewClass {
    public volatile String str;

    public static String manage(int a) {
        String str = Integer.toBinaryString(a);
        System.out.println(Integer.bitCount(a));

        int count = 0;
//        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if ("1".equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return String.format("二进制1的个数：" + count);
    }

    public static void main(String[] args) {
        int a = 7;

//        String resultStr = manage(a);
//        System.out.println(resultStr);
        System.out.println(8 >>> 4);
    }
}
