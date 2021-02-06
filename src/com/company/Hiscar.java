package com.company;

public class Hiscar implements Carinterface {

    String model;
    int speed;
    String color;

    Hiscar (){

    }

    Hiscar (String model, int speed, String color){

        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    void gas (int a){
        System.out.println("gas:" + a);
    }

    void brake (int a){
        System.out.println("brake:" + a);
    }

  public void description(){

     System.out.println(model);
     System.out.println(speed);
     System.out.println(color);
 }
}
