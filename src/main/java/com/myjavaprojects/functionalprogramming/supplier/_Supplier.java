package com.myjavaprojects.functionalprogramming.supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println();
        System.out.println("Supplier");
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getNickNames.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:3306/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:3306/users";

    static Supplier<List<String>> getNickNames = () -> List.of("Kasee", "Mahrez", "Lefty");
}
