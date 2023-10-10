package com.myjavaprojects.interfacepractice;

public class InterfacePracticeDemo {
    
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();

        ByThrees byThrees = new ByThrees();

        Series obj;

        obj = byTwos;
    
        for(int i = 0; i<=6; i++){
            //System.out.println(obj.getNext());
            System.out.println(obj.MAX);
            obj.printStuff();
        }
        
    }


}
