package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Stream operation");
        System.out.println("Intermediate operations");
        List<String> memberNames = new ArrayList<>(List.of(
                "Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Salman", "Yana", "Lokesh"
        ));


        System.out.println("filter method: accepts predicate to filter all elements of streams");
        memberNames.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
        Stream<String>m= memberNames.stream().filter((s)->s.startsWith("A"));
        System.out.println("create a ReferencePipeline for streams");
        System.out.println(m);
        m.forEach(System.out::println);

        System.out.println("___________________-");
        System.out.println(".map function converts each elements in streams into another objects");
        Stream<String> m1=memberNames.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase());
        System.out.println(m1);
//        m1.forEach(System.out::println);
        memberNames.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("__________________________");
        System.out.println("The sorted() method is an intermediate operation that returns a sorted view of the stream. The elements in the stream are sorted in natural order unless we pass a custom Comparator.");
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
