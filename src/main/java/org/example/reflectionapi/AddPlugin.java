package org.example.reflectionapi;

public class AddPlugin implements CalculatorPlugin{
    @Override
    public int execute(int a, int b) {
        return a+b;
    }
}
