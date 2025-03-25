package org.example.reflectionapi;

public class MultiplyPlugin implements CalculatorPlugin{
    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
