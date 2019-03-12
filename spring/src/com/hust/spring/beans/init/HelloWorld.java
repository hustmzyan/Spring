package com.hust.spring.beans.init;

public class HelloWorld {

    private String name;

    public HelloWorld(){
        System.out.println("HellorWorld's Constructor...");
    }

    public void setName2(String name){
        System.out.println("SetName: " + name);
        this.name = name;
    }

    public void hello(){
        System.out.println("hello: " + name);
    }
}
