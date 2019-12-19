package com.company;

public class Car {
    private String name;
    private double weight;
    private RulCar[] rulCar;


    public class RulCar {
        private String material;
        void turnRight() {

        }
        void turnLeft() {

        }
    }

    void doMove() {
        System.out.println("Moving...");
    }
}
