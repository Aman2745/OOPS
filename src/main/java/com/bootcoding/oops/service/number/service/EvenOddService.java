package com.bootcoding.oops.service.number.service;

public class EvenOddService {
    public String isEvenOdd(int n){
        String evenOdd = (n % 2 == 0) ? "even" : "odd";
        return  evenOdd;
    }
}
