package com.myjavaprojects.generic;

public class GenericDemo {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(20);
        Printer<String> printer2 = new Printer<String>("Steing generic");
        
        printer.print();
    }
}
