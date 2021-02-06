package com.company;

public class Mycar extends Car {

    Mycar() {
    }

    Mycar(String model, int speed, String color) {

        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    @Override
    void description() {

        System.out.println(model);
        System.out.println(speed);
        System.out.println(color);
    }
}
