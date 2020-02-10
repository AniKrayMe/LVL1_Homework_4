package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ruben", 14);
        Person person2 = new Person("Jake", 17);
        Person person3 = new Person("Karlos", 25);
        Person person4 = new Person("Nicolas", 20);
        Person person5 = new Person("Alex", 15);
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        List<Person> kids = people.stream()
                .filter((each) -> each.getAge() < 18)
                .collect(Collectors.toList());
        kids.forEach((each)-> System.out.println(" kids  = "+each));

        List<Person> adults = people.stream()
                .filter((each) -> each.getAge() >= 18)
                .collect(Collectors.toList());
        adults.forEach((each)-> System.out.println(" adults   = "+each));


    }
}
