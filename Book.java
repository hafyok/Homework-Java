package com.company;
import java.lang.*;

public class Book {
    private String name, creator;
    private int pages;

    public Book(String name, String creator){
        this.name = name;
        this.creator = creator;
    }
    public Book(String name){
        this.name = name;
        this.creator = "unknown";
    }

    public String getName(){
        return name;
    }
    public String getCreator(){
        return creator;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }
    public String showString(){
        return "' " + name + " ' written by " + creator;
    }

}
