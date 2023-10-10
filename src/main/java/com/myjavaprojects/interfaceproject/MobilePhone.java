package com.myjavaprojects.interfaceproject;

public class MobilePhone implements Telephone {
    private String myPhoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;
    
    public MobilePhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

      @Override
    public void powerOn() {
        isPowerOn =true;
        System.out.println("Mobile phone on..");
       
    }

    @Override
    public void dial(String number) {
       System.out.println("Now ringing " + number + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){

            System.out.println("Answering mobile phone phone");
            isRinging = false;
        }
        System.out.println("Phone not ringing");
    }

    @Override
    public boolean callPhone(String phoneNumber) {
       if(phoneNumber == myPhoneNumber && isPowerOn){
        isRinging = true;
        System.out.println("Phone ringing");
       }else{
        System.out.println("Either wrong number or power off");
        isRinging = false;
       }

       return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
}
