package com.learn.math;

import java.util.Scanner;

/**
 * Написати 5 методів:
 * 1. Сума +
 * 2. Різниця +
 * 3. Множення +
 * 4. Ділення +
 * 5. Обробка основної інформації (крапка входу) +
 * <p>
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

    public static int workSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
        return sum(a, b);
    }

    public static int workSumAns(int an) {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = an;
        int b = sc.nextInt();
        System.out.println(sum(a, b));
        return sum(a, b);
    }

    public static int workDif() {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(dif(a, b));
        return dif(a, b);
    }

    public static int workDifAns(int an) {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = an;
        int b = sc.nextInt();
        System.out.println(dif(a, b));
        return dif(a, b);
    }

    public static int workMul() {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mul(a, b));
        return mul(a, b);
    }

    public static int workMulAns(int an) {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = an;
        int b = sc.nextInt();
        System.out.println(mul(a, b));
        return mul(a, b);
    }

    public static int workDiv() {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(div(a, b));
        return div(a, b);
    }

    public static int workDivAns(int an) {
        Scanner sc = new Scanner(System.in);

        System.out.println(MESSAGE);

        int a = an;
        int b = sc.nextInt();
        System.out.println(div(a, b));
        return div(a, b);
    }

    int helpOn(char what) {
        switch (what) {
            case '1':
                return workSum();
            case '2':
                return workDif();
            case '3':
                return workMul();
            case '4':
                return workDiv();
        }
        System.out.println();
        return 0;
    }

    int helpOnAns(char whatAns, int ans) {
        switch (whatAns) {
            case '1':
                return workSumAns(ans);
            case '2':
                return workDifAns(ans);
            case '3':
                return workMulAns(ans);
            case '4':
                return workDivAns(ans);
        }
        System.out.println();
        return 0;
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
        for (; ; ) {
            Scanner cs = new Scanner(System.in);
            char choice;
            int answer = 0;
            ClacYarik hlpobj = new ClacYarik();
            hlpobj.showMenu();
            choice = cs.next().charAt(0);
            while (!hlpobj.isValid(choice)) {
                System.out.println("Введіть правильне значення");
                hlpobj.showMenu();
                choice = cs.next().charAt(0);
            }
            if (choice == 'q') break;
            System.out.println();
            answer = hlpobj.helpOn(choice);

            System.out.println("Будете продовжувати дії з результатом?");
            System.out.println("Якщо так введіть - 1");
            char c = (char) System.in.read();
            if (c == '1') {
                char choiceAns = 0;
                int answerAns = 0;
                ClacYarik hlpobjAns = new ClacYarik();
                if (!hlpobjAns.isValid(choiceAns)) {
                    hlpobjAns.showMenu();
                    choiceAns = cs.next().charAt(0);
                }
                if (choiceAns == 'q') break;
                System.out.println();
                answerAns = hlpobjAns.helpOnAns(choiceAns, answer);

                System.out.println("Будете продовжувати дії з результатом?");
                System.out.println("Якщо так введіть - 1");
                char cAns = '0';
                cAns = cs.next().charAt(0);
                if (cAns != '1') break;
                for (; ; ) {
                    char choiceAnsFor = '0';
                    int answerAnsFor = 0;
                    ClacYarik hlpobjAnsFor = new ClacYarik();
                    do {
                        hlpobjAnsFor.showMenu();
                        choiceAnsFor = (char) cs.nextInt();
                    } while (!hlpobjAnsFor.isValid(choiceAnsFor));
                    if (choiceAnsFor == 'q') break;
                    System.out.println();
                    answerAns = hlpobjAnsFor.helpOnAns(choice, answerAns);
                    System.out.println("Будете продовжувати дії з результатом?");
                    System.out.println("Якщо так введіть - 1");
                    char cAnsFor = '0';
                    cAnsFor = (char) System.in.read();
                    if (cAnsFor != '1') break;
                }
            }
        }
    }
}