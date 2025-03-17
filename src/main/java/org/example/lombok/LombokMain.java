package org.example.lombok;

public class LombokMain {

    public static void main(String[] args) {
        SampleClass sam=new SampleClass();

        sam.setA(7777);
        sam.setB(8);

        System.out.println(sam.getA());
        System.out.println(sam.getB());
    }
}
