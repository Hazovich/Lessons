package com.learn.math;

import java.util.Scanner;

/**
 * Написати 5 методів:
 * 1. Сума +
 * 2. Різниця +
 * 3. Множення +
 * 4. Ділення +
 * 5. Обробка основної інформації (крапка входу) +
 *
 *  * - Розробити функціонал для роботи з попереднім результатом -
 */

public class CalcSasha {

    private static final String MESSAGE = "Введіть числа: ";

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
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
        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

    public static void workDiff() {
        Scanner sc = new Scanner(System.in);
        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(diff(a, b));
    }

    public static void workMul() {
        Scanner sc = new Scanner(System.in);
        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mul(a, b));
    }

    public static void workDiv() {
        Scanner sc = new Scanner(System.in);
        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(div(a, b));
    }

    public static void fuck(char choise) {
        switch (choise) {
            case '+':
                workSum();
                break;
            case '-':
                workDiff();
                break;
            case '*':
                workMul();
                break;
            case '/':
                workDiv();
                break;
            default:
                System.out.println("введи норм");

        }
    }

    public static void main(String[] args) {
        try {
            fuck('+');
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Довбойоб введи ціле число");
            workSum();
        }
    }
}