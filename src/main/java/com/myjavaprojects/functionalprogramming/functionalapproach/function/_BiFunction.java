package com.myjavaprojects.functionalprogramming.functionalapproach.function;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        int ans = incrementByOneAndMultiply(2, 10);
        System.out.println("Normal " +ans);

        //Bi function - takes 2 arguments and returns 1
         int answer = incrementByOneAndMultiplyBiFunction.apply(3, 20);
        System.out.println("Bi function approach " + answer);
    }

    static int incrementByOneAndMultiply(int num, int numToMultiply) {
        return (num + 1) * numToMultiply;
    }

    // bi function approach
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numToIncrementByOne,
            numToMultiply) -> (numToIncrementByOne + 1) * numToMultiply;
}
