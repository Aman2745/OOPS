package com.bootcoding.oops.service.number.service;

import java.util.Random;

import static java.lang.Math.random;

public class NumberService {
    public int getRandomNumber(int n){
        Random random=new Random();
        n=random.nextInt(2000);
        return  n;
    }

}
