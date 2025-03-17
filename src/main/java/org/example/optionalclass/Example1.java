package org.example.optionalclass;

import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {
        Optional<String> name=Optional.ofNullable("govina");
        name.ifPresent(System.out::println);
        Optional<String> name1=Optional.ofNullable(null);
        System.out.println("nothing happens if optional is empty");
        name1.ifPresent(System.out::println);
        System.out.println("_____");

        Optional<Integer> integer=Optional.of(8);
        integer.ifPresent(System.out::println);
        System.out.println(integer.get());

    }
}
