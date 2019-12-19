package com.company;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        Car.RulCar rr = bmw.new RulCar();
        rr.turnLeft();
        rr.turnRight();
        bmw.doMove();

        ElectroCar tesla = new ElectroCar();
        tesla.doMove();




    }
}
