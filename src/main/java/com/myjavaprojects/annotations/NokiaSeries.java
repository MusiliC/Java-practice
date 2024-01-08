package com.myjavaprojects.annotations;

@SmartPhone(os="windows", version = "6")
public class NokiaSeries {
    String modelling;
    int screenSize;
    public NokiaSeries(String modelling, int screenSize) {
        this.modelling = modelling;
        this.screenSize = screenSize;
    }

    
}
