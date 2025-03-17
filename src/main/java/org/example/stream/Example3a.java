package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example3a {
    public static void main(String[] args) {
        System.out.println("Stream Operation");
        System.out.println("Terminal Operation");

        List<String> memberNames = new ArrayList<>(List.of(
                "Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Salman", "Yana", "Lokesh"
        ));

        System.out.println("forEach operation");
        memberNames.forEach(System.out::println);

        System.out.println("collect operation");
        System.out.println("The collect() method is used to receive elements from steam and store them in a collection.");
        List<String> memNamesInUppercase=memberNames.stream().sorted().map(String::new).toList();
        System.out.println(memNamesInUppercase);


        System.out.println("match operations");
        System.out.println("Various matching operations can be used to check whether a given predicate matches the stream elements. All of these matching operations are terminal and return a boolean result");
        boolean matchResult=memberNames.stream().anyMatch(s->s.startsWith("A"));
        System.out.println(matchResult);
        matchResult=memberNames.stream().allMatch(s->s.startsWith("A"));
        System.out.println(matchResult);
        matchResult=memberNames.stream().noneMatch(s->s.startsWith("A"));
        System.out.println(matchResult);

        System.out.println("count operations");
        System.out.println("The count() is a terminal operation returning the number of elements in the stream as a long value.");
        long totalmatched=memberNames.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(totalmatched);

        System.out.println("reduce operation");
        System.out.println("The reduce() method performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.");
        Optional<String> reduced=memberNames.stream().reduce((s1,s2)->s1+"#"+s2);
        reduced.ifPresent(System.out::println);



    }
}
