package com.company;

public abstract class Car {
    String model;
    int speed;
    String color;


    void gas(int a){
      System.out.println("gas:" +a);

    }
    void brake(int a){
      System.out.println("brake:" +a);

    }

    abstract void description();

}
