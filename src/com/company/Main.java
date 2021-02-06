package com.company;

public class Main {

    public static void main(String[] args) {

        Mycar lamba = new Mycar("lamba", 200, "yellow");

        lamba.description();
        lamba.gas(88);
        lamba.brake(55);

        Hiscar porsche = new Hiscar("porsche", 150, "red");
        porsche.description();
        porsche.gas(15);
        porsche.brake(17);
        }
    }



