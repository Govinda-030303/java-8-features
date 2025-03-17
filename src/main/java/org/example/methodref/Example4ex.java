package org.example.methodref;

public class Example4ex {
    Example4ex(){
        System.out.println("created");
    }

    private String name;
    private String age;
    private String gender;

    Example4ex(String name){
        this.name=name;
        System.out.println("create with "+name);
    }

    Example4ex(String name,String age, String gender){
        this.name=name;
        this.age=age;
        this.gender = gender;
        System.out.println("create with "+name + " "+ age+ " "+ gender);
    }

}
