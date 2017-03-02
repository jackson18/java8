package com.java8.test05;

import com.java8.test01.SimpleInterface;
import sun.applet.Main;

import java.time.*;
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

        final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);
        System.out.println( datetimeFromClock );
        System.out.println(date.getTime());

        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now( ZoneId.of("America/Los_Angeles") );
        System.out.println( zonedDatetimeFromClock );
        System.out.println( zonedDatetimeFromZone );
    }


}


