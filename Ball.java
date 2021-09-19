package com.company;
import java.lang.*;

public class Ball {
    private String sport;
    private String color;

    public Ball(String sport, String color){
        this.sport = sport;
        this.color = color;
    }
    public Ball(String sport){
        this.sport = sport;
        color = "white";
    }
    public Ball(){
        sport = "football";
        color = "white";
    }
    public void setNameSport(String sport){
        this.sport = sport;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getNameSport(){
        return sport;
    }
    public String getColor(){
        return color;
    }

    public void showBalls(){
        System.out.println("Это " + sport + "льный мяч цвета: " + color);
    }
}
