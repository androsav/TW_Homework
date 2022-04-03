package com.company;

public class Train extends Vehicle implements IMovable {
    String model;

    public Train(String name_, String type_, String model_){
        name = name_;
        type = type_;
        model = model_;
    }
    @Override
    public void MoveForward(){
        System.out.println("Train " +name + " moving forward.");
    }
    @Override
    public void MoveBackward(){
        System.out.println("Train " + name + "  moving backward.");
    }
    @Override
    public void StopMoving(){
        System.out.println("Train  " + name + " stopped.");
    }
}
