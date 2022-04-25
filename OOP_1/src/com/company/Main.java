package com.company;

public class Main {

    public static void main(String[] args) {


        Engine trainEngine = new Engine("400 hp","40 liters", 1600 );
	    Train train = new Train("Electric locomotive", "Passenger", trainEngine,"ER1");
        Engine carEngine = new Engine("280 hp","2,4 liters", 7000 );
        Car car = new Car("Nissan skyline", "Sport",carEngine, "Sedan");

        train.MoveForward();
        train.MoveBackward();
        train.StopMoving();

        car.MoveForward();
        car.StepOnGasPedal();

        car.StepOnGasPedal();
        car.StepOnGasPedal();
        car.StepOnGasPedal();
        car.StepOnGasPedal();
        car.StepOnGasPedal();
        car.StepOnGasPedal();
        car.StepOnGasPedal(); car.StepOnGasPedal();

        car.TurnLeft();
        car.MoveBackward();
        car.TurnRight();
        car.StopMoving();
    }
}
