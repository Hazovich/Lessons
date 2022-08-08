package com.learn.zoo;

import com.learn.model.BaseModel;

public abstract class Animal extends BaseModel {

    private int paws;

    public Animal() {
        super();
    }

    public Animal(int age, String food, int paws) {
        super(age, food);
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "paws=" + paws +
                ", age=" + super.getAge() +
                ", eat='" + super.getEat() + '}';
    }
}