package org.example.interfaces8.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;

public class Example1 {

    public static void main(String[] args) {
        Function<Integer,Integer> mul =(a)->a*a;
        System.out.println(mul.apply(3));

//        Consumer<String> str=(a)-> System.out.println(a);
        Consumer<String> str= System.out::println;
        str.accept("Govinda bitlani");

    }
}
