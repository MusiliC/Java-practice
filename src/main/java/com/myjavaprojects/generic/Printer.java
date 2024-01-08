package com.myjavaprojects.generic;

import java.util.List;

public class Printer <T> {
    T thingToPrint;

    
    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println("Print method");
    }

    private static <T, V > T shout(T shout, V shout2){
        System.out.println("The dying hour");
        return shout;
    }

    public void printUnknown(List<?> myList){
        System.out.println("Unknown input type");
    }
    

}
