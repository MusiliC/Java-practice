package com.myjavaprojects.listAndMap;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        createList();
    }

    public static void createList(){
        ArrayList<String> students = new ArrayList<>();

        students.add("Musili");
        students.add("Mayani");

        System.out.println(students);

        students.set(1, "Mahrez");
        System.out.println(students);

        students.remove(1);
        System.out.println(students);

        System.out.println("Clearing list");
        students.clear();
        System.out.println(students);
    }
}
