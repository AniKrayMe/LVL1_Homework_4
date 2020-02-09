package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add( "joji" );
        list.add( "xxxtentacion" );
        list.add( "peep" );
        list.add( "Ghostmane" );
        list.add( "boys" );
        List<String> collect = list.stream()
                .filter((each)-> each.length() == 4 )
                .collect( Collectors.toList() );
        collect.forEach( (each)-> System.out.println(each) );

    }
}
