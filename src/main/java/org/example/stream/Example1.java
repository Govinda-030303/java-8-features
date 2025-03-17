package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("________________________________");
        System.out.println("stream creation methods");
        System.out.println("________________________________");

        System.out.println("creating streams using .of mehtod");
        Stream<Integer> integerStream=Stream.of(1,2,3,5,6,7,9);
        integerStream.forEach(s-> System.out.println(s));

        System.out.println("using .of(array) method= streams from array");
        Stream<String> stringStream=Stream.of(new String[]{"govinda","bitlani","gbg","030303"});
        stringStream.forEach(System.out::println);

        System.out.println("using list.stream");
        List<String> stringList= new ArrayList<>();
        stringList.add("govinda");
        stringList.add("bitlani");
        stringList.add("gbg");
        stringList.stream().filter(s->s.equals("govinda")).forEach(System.out::println);

        System.out.println("using stream.generate");
        Stream<Integer> randomNumbers=Stream.generate(()->(new Random().nextInt(100)));
        randomNumbers.limit(20).forEach(System.out::println);

        System.out.println("stream of string char or tokens");
        IntStream stream="123w432_&".chars();
        stream.forEach(System.out::println);

        System.out.println("antoher examples ");
        Stream<String> stringStream1=Stream.of("030303$gbg$bitlani$govinda".split("\\$"));
        stringStream1.forEach(System.out::println);
    }
}
