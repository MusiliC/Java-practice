package com.myjavaprojects.interfaceproject;

public class Deskphone implements Telephone {

    private String myNumber;
    private boolean isRinging;

    

    public Deskphone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
       System.out.println("Deskphone is always powered");
    }

    @Override
    public void dial(String number) {
       System.out.println("Now ringing " + number + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){

            System.out.println("Answering desk phone");
            isRinging = false;
        }
        System.out.println("Phone not ringing");
    }

    @Override
    public boolean callPhone(String phoneNumber) {
       if(phoneNumber == myNumber){
        isRinging = true;
        System.out.println("Phone ringing");
       }else{
        isRinging = false;
       }

       return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
}
