package com.yhtian.springboot.learn;

import java.lang.reflect.Method;

/**
 * @author: yhtian
 * @date: 2021/03/04
 * @description:
 */
public class MethodReflection {
    public void testPrint(String param) {
        System.out.println("hello " + param);
    }
}

class Test {
    public static void main(String[] args) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer. append("abcdefg");
        System. out. println(stringBuffer. reverse().toString()); // gfedcba
    }
}
