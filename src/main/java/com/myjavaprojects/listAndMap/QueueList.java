package com.myjavaprojects.listAndMap;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
    public static void main(String[] args) {
        workList();
    }

    public static void workList(){
        Queue<String> fruits = new LinkedList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Access first");
        System.out.println(fruits.peek()); 

        System.out.println("Returns and remove first");
        System.out.println(fruits.poll()); 
        System.out.println(fruits);

        System.out.println("Add element at the end");
        fruits.offer("banana");
        System.out.println(fruits);
    }
}


