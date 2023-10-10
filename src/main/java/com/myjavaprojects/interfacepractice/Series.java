package com.myjavaprojects.interfacepractice;

public interface Series {

    int MAX = 10; //variables in interfaces are static and final cannotbe changed;
    String ERRMSG = "Cannot go above value: " + MAX;

    int getNext();

    //by making it static from default you can call the method without initiating an object
    default void printStuff(){
        System.out.println("Default methods!");
    }
}
