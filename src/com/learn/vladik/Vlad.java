package com.learn.vladik;

import com.learn.Week;

public class Vlad {

    static Week day = Week.MO;

    public static void main(String[] args) {
        switch (day) {
            case MO:
                System.out.println("Monday");
                break;
            case TU:
                System.out.println("Tuesday");
                break;
            case WE:
                System.out.println("WE");
                break;
            case TH:
                System.out.println("th");
                break;
            case FR:
                System.out.println("fr");
                break;
            case SA:
                System.out.println("SA");
                break;
            case SU:
                System.out.println("SU");
                break;
            default:
                System.out.println("AAA");
                break;
        }
    }
}
