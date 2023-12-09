package ru.volkova;

import java.util.Objects;

public class DayOfWeekService {
    public void dayOfTheWeek(String day) {
        String dayInRus;
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.MONDAY))){
            dayInRus =" понедельник!";
            System.out.println("Сегодня " + dayInRus);
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.TUESDAY))){
            dayInRus = " вторник!";
            System.out.println("Сегодня " + dayInRus);
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.WEDNESDAY))){
            dayInRus = " среда!";
            System.out.println("Сегодня " + dayInRus);
        }
        if(Objects.equals(day,String.valueOf(EnumDayOfWeek.THURSDAY))){
            dayInRus =" четверг!";
            System.out.println("Сегодня " + dayInRus);
        }
        if(Objects.equals(day,String.valueOf(EnumDayOfWeek.FRIDAY))){
            dayInRus =" пятница!";
            System.out.println("Сегодня " + dayInRus);
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.SATURDAY))){
            dayInRus =" суббота!";
            System.out.println("Сегодня " + dayInRus);
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.SUNDAY))){
            dayInRus =" воскресенье!";
            System.out.println("Сегодня " + dayInRus);
        }
    }
}
