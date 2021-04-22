package com.yhtian.springboot.service;

import java.text.ParseException;

/**
 * @author: yhtian
 * @date: 2021/03/23
 * @description:
 */
public class StringDemo {
    private static final int minuteCount = 1;
    private static final int hourCount = 6;
    private static final int dayCount = 144;

    private static final long minute = 10L;
    private static final long hour = 60L;
    private static final long day = 1440L;

    public static String calcTimescale(Long minutes) {
        String d = "", h = "", m = "";
        String format = "";
        if (minutes >= day) {
            d = String.valueOf(minutes / day);
            h = String.valueOf(minutes % day / hour);
            m = String.valueOf(minutes % day % hour);
            format = String.format("%sd%sh%sm", d, h, m);
        } else if (minutes >= hour) {
            h = String.valueOf(minutes / hour);
            m = String.valueOf(minutes % hour);
            format = String.format("%sh%sm", h, m);
        } else {
            format = String.format("%sm", minutes);
        }

        return format;
    }

    public static String calcTimescaleByCount(int count) {
        String d = "", h = "", m = "";
        String format = "";
        if (count >= dayCount) {
            d = String.valueOf(count / dayCount);
            h = String.valueOf(count % dayCount / hourCount);
            m = String.valueOf(count % dayCount % hourCount * 10);
            format = String.format("%sd%sh%sm", d, h, m);
        } else if (count >= hourCount) {
            h = String.valueOf(count / hourCount);
            m = String.valueOf(count % hourCount * 10);
            format = String.format("%sh%sm", h, m);
        } else {
            format = String.format("%sm", count * 10);
        }

        return format;
    }

    public static void main(String[] args) throws ParseException {
        int count = 189;
        long minutes = 1890L;
        System.out.println(calcTimescale(minutes));
        System.out.println(calcTimescaleByCount(count));

        int count_1 = 133;
        long minutes_1 = 1330L;
        System.out.println(calcTimescale(minutes_1));
        System.out.println(calcTimescaleByCount(count_1));

        int count_2 = 9;
        long minutes_2 = 59L;
        System.out.println(calcTimescale(minutes_2));
        System.out.println(calcTimescaleByCount(count_2));
    }
}
