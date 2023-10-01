package com.myjavaprojects.interfacepractice;

public class ByThrees implements Series{
     int val;

    public ByThrees(int val) {
        this.val = 0;
    }    

    public ByThrees() {
    }

    @Override
    public int getNext() {
        this.val += 3;
        return val;
    }
}
