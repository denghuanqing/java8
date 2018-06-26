package com.poppy.time;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * @author poppy
 * @date 2018/5/28 21:26
 */
public class TimeTest {
    public static void main(String[] args) {

/*      用户常用的时间格式
        LocalDate
        LocalTime
        LocalDateTime*/

        // 实例化APi
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime of = LocalDateTime.of(2015, 5, 28, 13, 45, 46, 57);
        System.out.println(of);

        //操作api
        LocalDateTime localDateTime = now.plusYears(2);
        System.out.println("加2年："+localDateTime);

        LocalDateTime localDateTime1 = now.minusDays(3);
        System.out.println("减3天"+localDateTime1);

        System.out.println(now.getYear());

        /**
         * 时间戳格式
         *
         */
        System.out.println("=======================================");
        Instant now1 = Instant.now(); // 默认UTC时区
        System.out.println(now1);

        /**
         * 比较时间
         * 比较日期
         */

    }

}
