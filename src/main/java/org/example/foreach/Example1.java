package org.example.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example1 {

    public static void main(String[] args) {
//        In the following example, System.out::println is a Consumer action representing an operation that accepts a single input argument and returns no result. It is an instance of Consumer interface. When used with list.forEach(), the program prints all the list items in the console one by one.
        System.out.println("forEach over List");
        List<String> listStr=new ArrayList<>();
        listStr.add("govinda");
        listStr.add("bitlani");
        listStr.add("gbg");
        listStr.add("govinda030303");

        listStr.forEach(System.out::println);

//  We can also create a custom BiConsumer action which will take key-value pairs from Map and process each entry one at a time.
        System.out.println("forEach over Map");
        Map<String ,String > map=Map.of("A","Govinda","B","Bitlani","C","GBG");
        map.forEach((k,v)-> System.out.println("key= "+k+" value= "+v));


    }
}
