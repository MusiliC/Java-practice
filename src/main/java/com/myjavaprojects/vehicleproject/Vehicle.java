
package com.myjavaprojects.vehicleproject;

public class Vehicle {
    
    private String name;
    private int currentSpeed;
    private int currentDirection;

    
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void move(int speed,int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Move method called: Moving at " + currentSpeed + " degrees" + " at this direction " + currentDirection + " degrees");
    }

    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Steer method called: Steering at " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle has stopped");
    }

    
}
