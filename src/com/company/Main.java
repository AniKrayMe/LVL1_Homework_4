package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ruben", 14,"American");
        Person person2 = new Person("Jake", 17,"American");
        Person person3 = new Person("Karlos", 25,"Russian");
        Person person4 = new Person("Nicolas", 20,"American");
        Person person5 = new Person("Alex", 15,"Russian");
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        List<Person> american = people.stream()
                .filter((each) -> each.getNationality().equals("American"))
                .collect(Collectors.toList());

        List<Person> russian = people.stream()
                .filter((each) -> each.getNationality().equals("Russian"))
                .collect(Collectors.toList());

        Map<String, List<Person>> personsListByNationality = new HashMap<>();
        personsListByNationality.put("American", american);
        personsListByNationality.put("Russian", russian);
        personsListByNationality.values().forEach((each)-> System.out.println(each));
    }
}
