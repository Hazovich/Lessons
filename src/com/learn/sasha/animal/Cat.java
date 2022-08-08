package com.learn.sasha.animal;

import com.learn.vladik.animal.Dog;
import com.learn.zoo.Animal;

public class Cat extends Animal {

    private String name;

    public Cat(String name, int age, int paws, String eat) {
        super(age, eat, paws);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        return "Slava Ukraine";
    }

    public String danger(Dog dog) {
        if (dog == null) {
            return "Where is foking dog?";
        } else if (dog.getDestination() <= 3) {
            return "Fucking fight";
        } else {
            return "All is Ok";
        }
    }
}