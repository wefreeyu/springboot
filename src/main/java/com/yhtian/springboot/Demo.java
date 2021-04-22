package com.yhtian.springboot;

/**
 * @author: yhtian
 * @date: 2021/01/29
 * @description: Demo
 */
public class Demo {
    public String name;

    public Demo(String name) {
        this.name = name;
    }

    public static String buildString(Object... args) {
        if (args == null) {
            return null;
        }

        StringBuffer buffer = new StringBuffer();

        for (Object object : args) {
            if (object != null) {
                buffer.append(object);
            }
        }

        return buffer.toString();
    }

    public static String generateFileName(String fileName) {
        if (fileName == null) {
            return "";
        }

        String prefix = fileName.substring(0, fileName.lastIndexOf("."));
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(buildString(prefix, "_", System.currentTimeMillis(), suffix));
        System.out.println();
        return "";
    }

    public static void main(String[] args) {
        generateFileName("12.43.txt");
    }
}
