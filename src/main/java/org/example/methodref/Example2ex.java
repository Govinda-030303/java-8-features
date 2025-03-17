package org.example.methodref;

import java.util.Map;

public class Example2ex {
    public void print(String message){
        System.out.println(message);
    }

    public void printall(Map.Entry<String,String> map){
        System.out.println(map.getKey()+ " -> "+ map.getValue());
    }

    public void printall(String s, String s1) {
        System.out.println(s+" -> "+s1);
    }
}
