package com.bootcoding.oops.cloning;

public class CreatingClone implements  Cloneable{
    String name;
    CreatingClone (String name){
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
         return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        CreatingClone clone=new CreatingClone("Aman");
        CreatingClone clonecopy=(CreatingClone)clone.clone();
        System.out.println(clonecopy.name);
    }
}
