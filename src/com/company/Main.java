package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add( 4 );
        numbers.add( 5 );
        numbers.add( 8 );
        numbers.add( 10 );
        numbers.add( 9 );
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
