package ru.volkova;

import java.util.Scanner;

public class ScannerDayOfWeek {

    public String scannerDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели ");
        return sc.next();
    }
}
