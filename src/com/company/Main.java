package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add( "bones" );
        list.add( "xxxtentacion" );
        list.add( "lil peep" );
        list.add( "Ghostmane" );
        list.add( "$uicideboy$" );
        List<String> collect = list.stream()
                .map( (each) -> each.toUpperCase() )
                .collect( Collectors.toList() );
        collect.forEach( (each)-> System.out.println(each) );

    }
}
