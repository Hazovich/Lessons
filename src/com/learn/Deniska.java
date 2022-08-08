package com.learn;

import com.learn.model.BaseModel;
import com.learn.sasha.animal.Cat;
import com.learn.vladik.animal.Dog;

public class Deniska {

    public static void main(String[] args) {

        Cat puhnastuk = new Cat("Puhnastuk", 20, 40, "Kakletki");
        Dog recs = new Dog("Recs", 20, 4, "meat", 3);

        System.out.println(BaseModel.getAnimalCount());
    }

}
