package com.myjavaprojects.vehicleproject;

public class Car extends Vehicle {

    private String carType;
    private int numberOfDoors;
    private int numberOfGears;
    private int currentGears;
    private boolean isManual;
    private int wheels;

    public Car(String name, String carType, int numberOfDoors, int numberOfGears, boolean isManual, int wheels) {
        super(name);
        this.carType = carType;
        this.numberOfGears = numberOfGears;
        this.numberOfDoors = numberOfDoors;
        this.isManual = isManual;
        this.wheels = wheels;
        currentGears = 1;
    }

    public void changeGear(int newGear) {
        this.currentGears = newGear;
        System.out.println("ChangeGear method called:  Changed to: " + this.currentGears + " gear");
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("Change speed method called: Accelerated by " + newSpeed  + " miles per hour "  + "New Speed -->  " + newSpeed + " direction --> " + newDirection);
    }

    public int getCurrentGears() {
        return currentGears;
    }

    public void setCurrentGears(int currentGears) {
        this.currentGears = currentGears;
    }

    

}
