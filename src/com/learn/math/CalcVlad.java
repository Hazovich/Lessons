package com.learn.math;

import java.util.Scanner;

/**
 * Написати 5 методів:
 * 1. Сума +
 * 2. Різниця +
 * 3. Множення +
 * 4. Ділення +
 * 5. Обробка основної інформації (крапка входу) -
 * <p>
 * * - Розробити функціонал для роботи з попереднім результатом -
 */

public class CalcVlad {

    private static final String MESSAGE = "Введіть числа: ";

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dif(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void workSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

    public static void wordMul() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mul(a, b));
    }

    public static void workDif() {
        Scanner sc = new Scanner(System.in);
        System.out.println(MESSAGE);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(dif(a, b));
    }

    public static void workDiv() {
        Scanner sc = new Scanner(System.in);
        System.out.println(MESSAGE);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(div(a, b));
    }
    //public static  void

}