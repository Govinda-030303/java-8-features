package org.example.lambdaexpr;

public class Example1 {
    public static void main(String[] args) {

//        created function body through lambda expression
//        We can create lambda expressions for this functional interface in the following manner. Notice we are able to create the method implementations and immediately use them. We do not need to create a concrete class Example1InterImpl that implements Example1Inter interface.
        System.out.println("of abstract method in functional interface");
        Example1Inter<Integer> printAdd=(a)-> a+3;
        System.out.println(printAdd.process(5));

        System.out.println("of default method in funcional interface");

        System.out.println(printAdd.process(5,6));

    }
}
