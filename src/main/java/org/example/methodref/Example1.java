package org.example.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Method references work only with functional interfaces because Java needs exactly one method to map the reference to.");
        System.out.println("Method Reference to a Static Method");
//        This method reference is used when we want to refer to a static method without invoking it. An example to use Math.max() which is a static method.
        List<Integer> integers= Arrays.asList(1,2,3,4,566,6);
        Optional<Integer> max= integers.stream().reduce(Math::max);

        max.ifPresent(value-> System.out.println(value));
//        max.ifPresent(System.out::println);

        Function<String,Integer> func=Integer::parseInt;
        int num=func.apply("44");
        System.out.println(num);











    }
}
