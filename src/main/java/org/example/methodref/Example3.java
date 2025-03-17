package org.example.methodref;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {

        List<String> messages = Arrays.asList("Hello", "World", "Method", "References");

        messages.forEach(Example3ex::print);
    }
}
