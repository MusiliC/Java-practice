package com.myjavaprojects.streams;
import java.util.List;


public class _Stream {
    public static void main(String[] args) {
           List<Person> people = List.of(
                new Person("Musili", Gender.MALE),
                new Person("Mary", Gender.FEMALE),
                new Person("James", Gender.MALE),
                new Person("Joy", Gender.FEMALE),
                new Person("Smith", Gender.PREFER_NOT_TO_SAY));
                           

            // people.stream()
            //         .map(person -> person.name)
            //         .mapToInt(String::length)                    
            //         .forEach(x -> System.out.println(x));

           boolean containsOnlyFemales = people.stream()
            .anyMatch(person -> Gender.FEMALE.equals(person.gender));

            System.out.println(containsOnlyFemales);
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
