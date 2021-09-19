package com.company;
import java.lang.*;
import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(int age){
        return age;
    }
    public String getName(String name){
        return name;
    }
    public String showValue(){
        return this.name + ", age " + this.age;
    }
    public void DogHumanAge(){
        System.out.println(name+"'s age in human years is " + age * 7 + " years");
    }

}


