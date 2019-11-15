package com.fhzc.datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TestDateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.with((x)->{
            LocalDateTime ldt1 = (LocalDateTime)x;
            DayOfWeek dow = ldt1.getDayOfWeek();
            if (dow.equals(DayOfWeek.FRIDAY)) {
                return ldt1.plusDays(3);
            }else if(dow.equals(DayOfWeek.SATURDAY)){
                return ldt1.plusDays(2);
            }else {
                return ldt1.plusDays(1);
            }
        });
        System.out.println(ldt2);

    }
}
