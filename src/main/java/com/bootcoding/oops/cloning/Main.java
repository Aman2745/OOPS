package com.bootcoding.oops.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aman=new Human("aman",40);
        Human twin=(Human)aman.clone();
        Human twinw=(Human)aman.clone();

        System.out.println(twin.age+twin.name);
        System.out.println(twinw.age+twinw.name);
    }
}
