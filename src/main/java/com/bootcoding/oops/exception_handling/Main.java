package com.bootcoding.oops.exception_handling;

public class Main {
    static int divide(int a , int b)throws  ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
    public static void main(String args[]){
        int a =5;
        int b=0;

        try{
            Main.divide(3,0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this always runs");
        }

    }
}
