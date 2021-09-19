package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog("Steph", 3);
        Dog d2 = new Dog("Ayesha", 8);
        Dog d3 = new Dog("James");
        System.out.println(d1);

        d1.showValue();
        d1.DogHumanAge();
        d2.DogHumanAge();
    }
}
