package org.example.optionalclass;

import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Default Values and Actions");
//        A typical pattern in programming is to return a default value if we determine that the result of an operation is null. In general, we can use the ternary operator; but with Optional, we can write the code as below:
        Optional<String> name = Optional.ofNullable(null );
        String result =name.orElse("govinda");
        System.out.println(result);
        System.out.println("__________________");
        String result1 =name.orElseGet(()->"govinda");
        System.out.println("orElseGet() is better than orElse() if computing the default value is expensive.");
        System.out.println(result1);
        System.out.println("________________");

        Optional<String> name1 = Optional.ofNullable(null);
        name1.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No value found")
        );
// Output: No value found
        Optional<String> name2 = Optional.ofNullable("govinda");
        name2.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No value found")
        );
// Output: value found

    }
}
