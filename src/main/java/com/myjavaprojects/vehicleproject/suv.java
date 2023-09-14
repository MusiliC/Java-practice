package com.myjavaprojects.vehicleproject;

public class suv extends Car {

    public suv(String name,  boolean isManual) {
        super(name, "SUV", 5, 6, isManual, 4);
        // TODO Auto-generated constructor stub
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        // speed - 0 : gear = 1
        // if speed 0 - 10 : gear = 1
        // if speed 10 - 20 : gear = 2
        // if speed 20 - 30 : gear = 3
        // if speed 30 - 50 : gear = 4
        // if speed 50 -70: gear = 5

        if (newSpeed <= 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed < 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);

        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else if (newSpeed > 30 && newSpeed <= 50) {
            changeGear(4);
        } else if (newSpeed > 50 && newSpeed <= 70) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }

    }

}
