package org.example.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example4 {
    public static void main(String[] args) {

//        using constructor reference
//        when having zero argument
        Supplier<Example4ex> f1=Example4ex::new;
//        product created
        Example4ex f1obj=f1.get();

//        when having no argument
        Function<String,Example4ex> f2=Example4ex::new;
//        create an instance
        Example4ex f2obj=f2.apply("govinda");


//        when having multiple argument
        MultiFunction<String,String,String,Example4ex> f3=Example4ex::new;
//        create an instance
        // Calling apply() -> Internally calls new Order("ORD123", "Alice", 250.75)
        Example4ex f3obj=f3.apply("goivnda","22","male");

    }
}
