package com.company;

public class Train extends Vehicle implements IMovable {
    String model;

    public Train(String name, String type, Engine engine, String model){
        this.name = name;
        this.type = type;
        this.engine = new Engine(engine.power, engine.capacity, engine.cutoff);
        this.model = model;
    }

    void AddGas(){
        engine.Gas(400);
    }
    @Override
    public void MoveForward(){
        AddGas();
        System.out.println("Train " +name + " moving forward.Current engine speed "+engine.GetSpeed());
    }
    @Override
    public void MoveBackward(){
        StopMoving();
        AddGas();
        System.out.println("Train " + name + "  moving backward.Current engine speed "+engine.GetSpeed());
    }
    @Override
    public void StopMoving(){
        System.out.println("Train  " + name + " stopped.");
    }
}
