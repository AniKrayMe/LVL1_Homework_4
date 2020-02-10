package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(20);
        Person person2 = new Person(30);
        Person person3 = new Person(50);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        Integer maxAge = arrayList.stream()
                .map(Person::getAge)
                .max(Integer::compare).get();


        List<Person> collect = arrayList.stream()
                .filter( (each)-> each.getAge() == maxAge)
                .collect(Collectors.toList());
        collect.forEach((each)-> System.out.println(each));


    }
}
