package com.myjavaprojects.interfaceproject;

public class InterfaceDemo {
    public static void main(String[] args) {
        // Deskphone myPhone = new Deskphone("12345");
        // myPhone.powerOn();
        // myPhone.callPhone("12345");
        // myPhone.answer();

        MobilePhone myPhone = new MobilePhone("123");

        myPhone.powerOn();
        myPhone.callPhone("123");
        myPhone.answer();
    }
}
