package org.example.methodref;

@FunctionalInterface
public interface MultiFunction<A,B,C,R> {
    R apply(A a,B b,C c);
}
