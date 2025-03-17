package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("After performing the intermediate operations on elements in the stream, we can collect the processed elements again into a Collection using the stream Collector methods.");

        System.out.println("number 1");
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
                list.add(i);
        }

        Stream<Integer> stream=list.stream();
//        List<Integer> evenNumberList=stream.filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> evenNumberList=stream.filter(n->n%2==0).toList();

        System.out.println(evenNumberList);

        System.out.println("_________________________________________");

        System.out.println("Java Streams are designed to be consumed only once. If you try to operate on them again, you'll get this error.");
        Stream<Integer> stream1=list.stream();
        Integer[] evenIntegers=stream1.filter(n->n%2==0).toArray(Integer[]::new);
        System.out.println(evenIntegers);
        for (Integer evenInteger : evenIntegers) {
            System.out.println(evenInteger);
        }
    }
}
