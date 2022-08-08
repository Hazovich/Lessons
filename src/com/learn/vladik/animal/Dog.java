package com.learn.vladik.animal;

import com.learn.zoo.Animal;

public class Dog extends Animal {

    private String name;
    private int destination;

    public Dog(String name, int age, int paws, String eat) {
        super(age, eat, paws);
        this.name = name;

    }

    public Dog(String name, int age, int paws, String eat, int destination) {
        super(age, eat, paws);
        this.name = name;
        this.destination = destination;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    @Override
    public String voice(){
        return "gavv";
    }
}