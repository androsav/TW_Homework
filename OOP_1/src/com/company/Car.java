package com.company;

public class Car extends Vehicle implements IMovable,ITurnable{

    String bodyType;
    public Car(String name, String type, Engine engine, String bodyType){
        this.name = name;
        this.type = type;
        this.engine = new Engine(engine.power, engine.capacity, engine.cutoff);
        this.bodyType = bodyType;
    }

    void StepOnGasPedal(){
        engine.Gas(1000);
    }

    @Override
    public void MoveForward() {
        StepOnGasPedal();
        System.out.println("Car "+name+" moving forward. Current engine speed "+engine.GetSpeed());
    }

    @Override
    public void MoveBackward() {
        StopMoving();
        StepOnGasPedal();
        System.out.println("Car " + name + "  moving backward.");
    }

    @Override
    public void StopMoving() {
        engine.Break();
        System.out.println("Car " + name + " stopped.");
    }

    @Override
    public void TurnLeft() {
        System.out.println("Car " + name + " turned left.");
    }

    @Override
    public void TurnRight() {
        System.out.println("Car " + name + " turned right.");
    }
}
