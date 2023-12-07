package ru.volkova;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DayOfWeekService dayOfWeekService = new DayOfWeekService();
        ScannerDayOfWeek scannerDayOfWeek = new ScannerDayOfWeek();
        String day = scannerDayOfWeek.scannerDay();
        dayOfWeekService.dayOfTheWeek(day);
    }
}
