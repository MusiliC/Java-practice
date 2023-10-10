package com.myjavaprojects.functionalprogramming.consumer;

import java.util.function.BiConsumer;

import com.myjavaprojects.functionalprogramming.consumer._Consumer.Customer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer musili = new Customer("Musili", "07000");
        greetCustomerConsumer.accept(musili, false);
    }

    // bi consumer

    static BiConsumer<Customer, Boolean> greetCustomerConsumer = (customer, showPhone) -> System.out
            .println("Functional BiConsumer -> " + "Hello " + customer.getCustomerName() + " with this number "
                    + (showPhone ? customer.getCustomerNumber() : " *****"));

    static void greetCustomer(Customer customer, Boolean showPhone) {
        System.out
                .println("Normal BiConsumer -> " + "Hello " + customer.getCustomerName() + " with this number "
                        + (showPhone ? customer.getCustomerNumber() : " *****"));
    }
}
