package org.example.lambdaexpr;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Example1Inter<T> {

    T process(T a);

    default List<T> process(T a, T b){
        List<T> listT=new ArrayList<>();
        listT.add(a);
        listT.add(b);
        return listT;
    }

}
