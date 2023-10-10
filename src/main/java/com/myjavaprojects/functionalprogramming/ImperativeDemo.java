package com.myjavaprojects.functionalprogramming;

import java.util.ArrayList;
import java.util.List;


public class ImperativeDemo {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Musili", Gender.MALE),
                new Person("Mary", Gender.FEMALE),
                new Person("James", Gender.MALE),
                new Person("Joy", Gender.FEMALE));

        System.out.println("// Imperative Approach");
        // imperative approach
        List<Person> femaleList = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                femaleList.add(person);
            }
        }

        for (Person female : femaleList) {
            System.out.println(female);
        }

        System.out.println("// Declarative Approach");

        // declarative approach - using streams and collections

        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))              
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }

    }

    enum Gender {
        MALE, FEMALE
    }
}
