package com.learn.todo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task {

    public void showMenu() {
        System.out.println("Меню: ");
        System.out.println(" 1. Вивести список завдань");
        System.out.println(" 2. Створити завдання");
        System.out.println(" З. Редагувати завдання");
        System.out.println(" 4. Видалити завдання");
        System.out.print("Bиберіть (0 - вихід): ");
    }

    public void createTask() throws java.io.IOException {
        try (FileWriter writer = new FileWriter("D:\\File_Java\\task-list.txt", true)) {
            Scanner task = new Scanner(System.in);
            int count = 0;
            writer.write(++count);
            writer.write("\n");
            writer.write(setData(task));
            writer.write("\n");
            System.out.println("Введіть завдання: ");
            writer.write(task.next());
            writer.write("\n");
        }
    }

    private String setData(Scanner task) {
        Calendar data = Calendar.getInstance();
        System.out.println("Введіть рік:");
        data.set(Calendar.YEAR, task.nextInt());
        System.out.println("Введіть місяць:");
        data.set(Calendar.MONTH, task.nextInt());
        System.out.println("Введіть день:");
        data.set(Calendar.DAY_OF_MONTH, task.nextInt());
        System.out.println("Введіть годину:");
        data.set(Calendar.HOUR, task.nextInt());
        System.out.println("Введіть хвилини:");
        data.set(Calendar.MINUTE, task.nextInt());
        return data.toString();
    }

    public Map<Integer, Map<String, String>> showList(boolean isShow) throws java.io.IOException {

        Map<Integer, Map<String, String>> taskList = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\File_Java\\task-list.txt"))) {
            while (reader.ready()) {
                Integer c = Integer.parseInt(reader.readLine());
                String d = reader.readLine();
                String t = reader.readLine();
                taskList.put(c, new HashMap<>() {{
                    put(d, t);
                }});
                if (isShow) System.out.println(c + " : " + d + " -> " + t);
            }
        }
        return taskList;
    }


    public void updateTask() throws java.io.IOException {
        Map<Integer, Map<String, String>> dataAndTaskForUp = showList(false);
        try (FileWriter writer = new FileWriter("D:\\File_Java\\task-list.txt")) {
            Scanner date = new Scanner(System.in);
            System.out.println("Введіть номер завдання, яке хочете редагувати: ");
            int num = date.nextInt();
            System.out.println("Введіть нове завдання: ");
            String newUpTask = date.nextLine();
            replaceTask(dataAndTaskForUp, num, newUpTask, writer);
            System.out.println("Завдання змінено успішно.");
        }
    }

    private void replaceTask(Map<Integer, Map<String, String>> taskList, int choice, String newTask,
                             FileWriter fw) throws IOException {

        taskList.get(choice).values().forEach(a -> a = newTask);
        for (int i = 1; i < taskList.size(); i++) {
            fw.write(i);
            fw.write("\n");
            fw.write(taskList.get(i).keySet().toString());
            fw.write("\n");
            fw.write(taskList.get(i).values().toString());
            fw.write("\n");
        }
    }


    public void deleteTask() throws java.io.IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\File_Java\\task-list.txt"))) {
            Map<String, String> DataAndTaskForDel = new HashMap<>();
            while (reader.ready()) {
                String d = reader.readLine();
                String t = reader.readLine();
                DataAndTaskForDel.put(d, t);
            }
            Set<Map.Entry<String, String>> DataAndTaskSetForDel = DataAndTaskForDel.entrySet();
            for (Map.Entry<String, String> del : DataAndTaskSetForDel) {
                System.out.print(del.getKey() + ": ");
                System.out.println(del.getValue());
            }
            try (FileWriter writer = new FileWriter("D:\\File_Java\\task-list.txt", false)) {
                Scanner date = new Scanner(System.in);
                System.out.println("Введіть дату завдання яке хочите видалити: ");
                String delTask = date.nextLine();
                DataAndTaskForDel.remove(delTask);
                Set<Map.Entry<String, String>> DataAndTaskSetAfterDel = DataAndTaskForDel.entrySet();
                for (Map.Entry<String, String> me : DataAndTaskSetAfterDel) {
                    writer.write(me.getKey());
                    writer.write("\n");
                    writer.write(me.getValue());
                    writer.write("\n");
                }
            }
        }
    }
}