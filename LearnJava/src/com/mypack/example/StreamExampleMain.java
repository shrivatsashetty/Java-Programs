package com.mypack.example;

import java.util.ArrayList;
import java.util.List;

public class StreamExampleMain {
    public static void main(String[] args) {

        /* creating a new arraylist to store the person */
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 24));
        people.add(new Person("Nathan", 37));
        people.add(new Person("Pravven", 27));
        people.add(new Person("Pratheek", 21));
        people.add(new Person("Patrick", 19));

        // forEach() method demo
        people.forEach(p -> System.out.println(p.getName()));

        people.removeIf(p -> p.getAge() > 25); // inplace operation

        System.out.println(people.size() + "people remaining in the list"); // 2 

        people.stream().forEach(p -> System.out.println(p.getName()));

        // Stream methods
        Person firstPerson = people.stream().filter(p -> p.getAge() < 25).findFirst().orElse(null);

        if(firstPerson != null){
            System.out.println("first person found: " + firstPerson.getName());
        }
        else{
            System.out.println("No person found");
        }
   
    }
}
