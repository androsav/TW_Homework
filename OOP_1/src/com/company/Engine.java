package com.company;

public class Engine {
    protected String power;
    protected String capacity;
    protected int cutoff;
    private int engineSpeed = 0;

    public Engine(String power, String capacity, int cutoff){
        this.power = power;
        this.capacity = capacity;
        this.cutoff = cutoff;
    }

    void Gas(int value){
        if (engineSpeed<cutoff){
            engineSpeed += value;
            System.out.println("Gas. Engine speed " + engineSpeed);
        }
        else{
            engineSpeed -= 1000;
            System.out.println("Cutoff. Engine speed " + engineSpeed);
        }
    }

    void Break(){
        engineSpeed = 1000;
        System.out.println("Break. Engine speed " + engineSpeed);
    }

    int GetSpeed(){
        return engineSpeed;
    }

    void ShowEngineInfo(){
        System.out.println("Engine power " + power);
        System.out.println("Engine capacity " + capacity);
        System.out.println("Engine cutoff " + cutoff);
    }
}
