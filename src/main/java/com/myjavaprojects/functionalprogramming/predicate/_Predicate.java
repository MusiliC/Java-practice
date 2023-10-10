package com.myjavaprojects.functionalprogramming.predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneValid("0700000000"));
        System.out.println(isPhoneValid("0900000"));

        // predicate you use test method
        System.out.println("Predicate testing");
        System.out.println(isPhoneValidPredicate.test("0700000000"));
        System.out.println(isPhoneValidPredicate.test("0900000"));

        //chaining predicate

        //and - all true
        //or - only one condition to be true 

       System.out.println("Contains number 3? " + 
        isPhoneValidPredicate.and(containsNumberThree).test("0700000000")
       );

         System.out.println("Contains number 3? " + 
        isPhoneValidPredicate.and(containsNumberThree).test("0700000003")
       );

       
    }

    static Boolean isPhoneValid(String number) {
        return number.startsWith("07") && number.length() == 10;
    }

    static Predicate<String> isPhoneValidPredicate = number -> number.startsWith("07") && number.length() == 10;

    static Predicate<String> containsNumberThree = number -> number.contains("3");
}
