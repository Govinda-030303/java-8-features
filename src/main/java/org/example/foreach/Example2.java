package org.example.foreach;

import java.util.List;
import java.util.function.Consumer;

public class Example2 {

    public static void main(String[] args) {
        System.out.println("streams examples");
        System.out.println("for sequential streams");
        List<Integer> numbersList=List.of(1,2,3,4,5,6);

        Consumer<Integer> action= System.out::println;

        numbersList.stream().filter(n->n%2==0).forEach(action);


        System.out.println("for parallel streams");
        List<Integer> numbersList1=List.of(1,2,3,4,5,6,5,6,7,3);

        numbersList1.stream().filter(n->n%2!=0).forEachOrdered(action);
    }
}
