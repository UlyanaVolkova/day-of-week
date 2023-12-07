package ru.volkova;

import java.util.Objects;

public class DayOfWeekService {
    public String dayOfTheWeek(String day) {
        String dayInRus = null;
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.MONDAY))){
            dayInRus =" понедельник!";
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.TUESDAY))){
            dayInRus = " вторник!";
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.WEDNESDAY))){
            dayInRus = " среда!";
        }
        if(Objects.equals(day,String.valueOf(EnumDayOfWeek.THURSDAY))){
            dayInRus =" четверг!";
        }
        if(Objects.equals(day,String.valueOf(EnumDayOfWeek.FRIDAY))){
            dayInRus =" пятница!";
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.SATURDAY))){
            dayInRus =" суббота!";
        }
        if(Objects.equals(day, String.valueOf(EnumDayOfWeek.SUNDAY))){
            dayInRus =" воскресенье!";
        }
        return String.format("Сегодня " + dayInRus);
    }
}
