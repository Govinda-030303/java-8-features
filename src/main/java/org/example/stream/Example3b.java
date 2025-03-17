package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class Example3b {
    public static void main(String[] args) {
        System.out.println("short circuit operations");
        System.out.println("Stream operations process all elements in a collection that match a Predicate, but sometimes it's preferable to stop processing once a match is found.");
        List<String> memberNames = new ArrayList<>(List.of(
                "Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Salman", "Yana", "Lokesh"
        ));

        System.out.println("any match");
        System.out.println("The anyMatch() will return true once a condition passed as predicate satisfies. Once a matching value is found, no more elements will be processed in the stream.");
        boolean matched=memberNames.stream().anyMatch((s)->s.startsWith("A"));
        System.out.println(matched);

        System.out.println("Stream.findFirst()");
        System.out.println("The findFirst() method will return the first element from the stream and then it will not process any more elements.");
        String firstMatchedName=memberNames.stream().filter(s->s.startsWith("A")).findFirst().get();
        System.out.println(firstMatchedName);




    }
}
