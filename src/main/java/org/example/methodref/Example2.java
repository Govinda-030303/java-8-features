package org.example.methodref;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Method Reference to Instance Method of a Particular Object");
        Example2ex example2ex=new Example2ex();

        List<String> message= Arrays.asList("hello","govinda","bitlani","gbg","030303","bye");

//        using lambda function
        message.forEach(s->example2ex.print(s));

//        using method reference
        message.forEach(example2ex::print);

        Map<String,String> map=new HashMap<>();
        map.put("govinda","bitlani");
        map.put("rajkumar","bitlani");
        map.put("mukesh","bitlani");
        map.put("lalit","bitlani");
        map.put("hemant","bitlani");

        System.out.println("when we use the simple function with lambda");
        map.forEach(example2ex::printall);
        System.out.println("when we use the simple fucntion without lambda");
        map.forEach((key,value)->example2ex.printall(key,value));

        System.out.println("when we use the function which uses the function as Map.Entry arguemnt");
        map.entrySet().forEach(example2ex::printall);
    }
}
