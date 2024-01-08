package com.myjavaprojects.generic;

public class DoublePrinter {
    Double thingToPrint;

    
    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public Double getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println("Print method - double");
    }
}
