package com.myjavaprojects.functionalprogramming.predicate;

import java.util.function.BiPredicate;


public class _BiPredicate {
    public static void main(String[] args) {
        // Bi predicate you use test method
        System.out.println("Bi Predicate testing");
        System.out.println(isPhoneValidPredicate.test("0700000000", "BrianMusili"));
    }

    static BiPredicate<String, String> isPhoneValidPredicate = (number, name) -> number.startsWith("07") && name.length() > 5;
}
