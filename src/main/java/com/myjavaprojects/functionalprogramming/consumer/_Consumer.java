package com.myjavaprojects.functionalprogramming.consumer;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        greetCustomer(new Customer("Musili", "070000"));
        greetCustomerConsumer.accept(new Customer("Musili", "070000"));
    }

    // using consumer

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out
            .println("Functional consumer " + "Hello " + customer.customerName + " with this number " + customer.customerNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Normal function " + "Hello " + customer.customerName + " with this number " + customer.customerNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerNumber;       

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerNumber() {
            return customerNumber;
        }

        public Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }

    }
}
