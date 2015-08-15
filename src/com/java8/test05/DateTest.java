package com.java8.test05;

import com.java8.test01.SimpleInterface;
import sun.applet.Main;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * Created by Administrator on 2015/8/15.
 */
public class DateTest {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long mills = clock.millis();
        System.out.println(mills);

        Instant instant = clock.instant();
        Date date = Date.from(instant);
        System.out.println(date.getTime());
    }


}


