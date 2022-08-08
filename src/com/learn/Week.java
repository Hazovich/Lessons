package com.learn;

public enum Week {

    MO("Понедельник"),
    TU("Вторник"),
    WE("Среда"),
    TH("Четверг"),
    FR("Пятница"),
    SA("Суббота"),
    SU("Воскресенье"),
    DEFAULT("DEFAULT");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getDay() {
        return name;
    }
}
