package com.learn.model;


public abstract class BaseModel {

    private static int animalCount;

    private int age;
    private String eat;

    public BaseModel() {
        animalCount++;
    }

    public BaseModel(int age) {
        this.age = age;
        animalCount++;
    }

    public BaseModel(int age, String eat) {
        this.age = age;
        this.eat = eat;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public abstract String voice();

}
