package org.example.stream.boxedStream;

import java.util.List;
import java.util.stream.*;

public class Example1 {
    public static void main(String[] args) {
        Stream<Integer> stream = IntStream.of(1, 2, 3, 4, 5).boxed();

        Stream<Long> stream1 = LongStream.of(1, 2, 3, 4, 5).boxed();

        Stream<Double> stream2 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0).boxed();

        System.out.println("Without boxing the stream items, we cannot perform the regular stream operations on them. For example, we cannot collect the int values to a list, directly.");

        //Compilation issue
    /*List<Integer> list = IntStream.of(1,2,3,4,5)
        .collect(Collectors.toList());*/
        List<Integer> list = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);

    }

}
