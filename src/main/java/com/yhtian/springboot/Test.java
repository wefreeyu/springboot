package com.yhtian.springboot;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: yhtian
 * @date: 2020/12/01
 * @description:
 */
public class Test {

    public static long getCurrentUtc()
    {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        Date date = Date.from(utc.toInstant());
        long epochMillis = utc.toEpochSecond() * 1000;
        return epochMillis;
    }

    public static long getCurrentUtcStartTime() {
        Calendar currentDate = Calendar.getInstance();
        return ZonedDateTime.of(currentDate.get(Calendar.YEAR), currentDate.get(Calendar.MONTH) + 1, currentDate.get(Calendar.DAY_OF_MONTH),
                0, 0, 0, 0, ZoneId.systemDefault()).toEpochSecond() * 1000;
    }


    public static void main(String[] args) {
        System.out.println(getCurrentUtc());
        System.out.println(getCurrentUtcStartTime());
    }
}
