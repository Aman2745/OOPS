package com.bootcoding.oops.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    Human(String name, int age){
        this.age=age;
        this.name=name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
