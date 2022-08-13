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
 * * - Розробити функціонал для роботи з попереднім результатом -
 */

public class ClacYarik {

    private static final String MESSAGE = "Введіть числа: ";


    /**
     * Method for sum two numbers
     *
     * @param a - first operand
     * @param b - second operand
     * @return - sum a and b
     */
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

        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

    public static void workDif() {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(dif(a, b));
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

    void helpOn(char what) {
        switch (what) {
            case '1':
                workSum();
                break;
            case '2':
                workDif();
                break;
            case '3':
                workMul();
                break;
            case '4':
                workDiv();
                break;

        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("Menu: ");
        System.out.println(" 1. SUM");
        System.out.println(" 2. DIF");
        System.out.println(" З. MUL");
        System.out.println(" 4. DIV");
        System.out.print("Bыбepитe (q - выход): ");
    }

    public boolean isValid(char ch) {
        if (ch < 49 || ch > 52 && ch != 'q') return false;
        else return true;
    }

    public static void main(String args[]) throws java.io.IOException {
        for (; ;) {

            char choice;
            ClacYarik hlpobj = new ClacYarik();

            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();
            } while (!hlpobj.isValid(choice));

            if (choice == 'q') break;

            System.out.println();
            hlpobj.helpOn(choice);
        }
    }
}