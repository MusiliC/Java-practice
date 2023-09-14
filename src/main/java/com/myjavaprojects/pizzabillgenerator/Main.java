package com.myjavaprojects.pizzabillgenerator;

public class Main {
    public static void main(String[] args) {       

        // Pizza pizza = new Pizza(true);
        // pizza.addExtraToppings();
        // pizza.addExtraCheese();
        // pizza.takeAway();
        // pizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
        dp.addExtraCheese();
        dp.getBill();
    }
}