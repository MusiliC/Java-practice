package com.myjavaprojects.interfaceproject;

public interface Telephone {
    //power one
    //dial
    //answer call
    //call another phone
    //is ringing?

    void powerOn();
    void dial(String number);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
