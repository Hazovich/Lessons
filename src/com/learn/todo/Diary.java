package com.learn.todo;

import java.util.*;

public class Diary {

    public static void main(String[] args) throws java.io.IOException {
        Task task = new Task();
        for (; ; ) {
            Scanner cs = new Scanner(System.in);
            task.showMenu();
            int choice = cs.nextInt();

            if (choice == 0) break;
            while (choice >= 5 || choice <= 0) {
                System.out.println("Введіть правильне значення");
                task.showMenu();
                choice = cs.nextInt();
            }
            helpOn(choice, task);
        }
    }

    public static void helpOn(int what, Task task) throws java.io.IOException {
        switch (what) {
            case 1:
                task.showList(true);
                break;
            case 2:
                task.createTask();
                break;
            case 3:
                task.updateTask();
                break;
            case 4:
                task.deleteTask();
                break;
        }
        System.out.println();
    }
}