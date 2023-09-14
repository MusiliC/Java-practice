package com.myjavaprojects.pizzabillgenerator;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int bagPack = 20;
    private int basePizzaPrize;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;

    public Pizza(boolean veg) {

        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        basePizzaPrize = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isTakeAway = true;
        this.price += bagPack;
    }

    public void getBill() {
        String bill = "";
        bill = "Pizza: " + basePizzaPrize + "\n";
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra toppings Added: " + extraToppingsPrice + "\n";
        }
        if (isTakeAway) {
            bill += "Extra take away charges Added: " + bagPack + "\n";
        }

        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }

}
