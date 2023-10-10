package com.myjavaprojects.functionalprogramming.function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // int increment = incrementByOne(0);
        // System.out.println(increment);

        // apply - takes the argument
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("increment method " + increment2);

        // chaining

        int multiply = multiplyByTen.apply(increment2);
        System.out.println("multiplying to increment " + multiply);

        // chaining + combining both functions
        Function<Integer, Integer> addByOneAndMultiplyByTen = incrementByOneFunction
                .andThen(multiplyByTen);

        System.out.println("Combined function (increment + multiplication) " + addByOneAndMultiplyByTen.apply(4));
    }

    // takes 2 arguments input and output(return type)
    // Function - interface
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    // another Function

    static Function<Integer, Integer> multiplyByTen = number ->  number * 10;

    // static int incrementByOne(int a) {
    //     return a + 1;
    // }
}
