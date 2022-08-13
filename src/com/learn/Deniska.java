package com.learn;

import com.learn.model.BaseModel;
import com.learn.sasha.animal.Cat;
import com.learn.vladik.animal.Dog;

public class Deniska {

    public static void main(String[] args) {

        /*Cat puhnastuk = new Cat("Puhnastuk", 20, 40, "Kakletki");
        Dog recs = new Dog("Recs", 20, 4, "meat", 3);

        System.out.println(BaseModel.getAnimalCount());*/

        char ch = 'A';

        if(ch == 'A') ch = (char) (ch + 32);
        else if (ch == 'a')  ch = (char) (ch - 32);

        System.out.println((int)'1');
        System.out.println((int)'2');
        System.out.println((int)'3');
        System.out.println((int)'4');
    }

}
