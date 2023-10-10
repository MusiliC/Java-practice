package com.myjavaprojects.vehicleproject;

public class Main {
    public static void main(String[] args) {
        suv v8 = new suv("V8", false);
        v8.move(10, 0);
        v8.accelerate(20);
        
        System.out.println("Get current gear: " + v8.getCurrentGears());
        System.out.println("Get current speed: " + v8.getCurrentSpeed());
    }
}
