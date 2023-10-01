package com.myjavaprojects.interfacepractice;

public class ByTwos implements SeriesSub {
    int val;

    public ByTwos(int val) {
        this.val = 0;
    }

    public ByTwos() {
    }

    @Override
    public int getNext() {

        if (val >= MAX) {
            System.out.println(ERRMSG);
            return val;
        } else {

            this.val += 2;
            return val;
        }
    }

    @Override
    public int getPrev() {
        this.val -= 2;
        return val;
    }

}
