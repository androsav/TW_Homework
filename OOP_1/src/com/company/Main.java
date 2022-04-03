package com.company;

public class Main {

    public static void main(String[] args) {
	Train train = new Train("Electric locomotive", "Passenger", "ER1");
    Car car = new Car("Nissan skyline", "Sport", "Sedan");

        train.MoveForward();
        train.MoveBackward();
        train.StopMoving();

        car.MoveForward();
        car.TurnLeft();
        car.MoveBackward();
        car.TurnRight();
        car.StopMoving();
    }
}
