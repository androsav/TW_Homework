package com.company;

public class Car extends Vehicle implements IMovable,ITurnable{

    String bodyType;
    public Car(String name_, String type_, String bodyType_){
        name = name_;
        type = type_;
        bodyType = bodyType_;
    }
    @Override
    public void MoveForward() {
        System.out.println("Car + "+name+" moving forward.");
    }

    @Override
    public void MoveBackward() {
        System.out.println("Car " + name + "  moving backward.");
    }

    @Override
    public void StopMoving() {
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
