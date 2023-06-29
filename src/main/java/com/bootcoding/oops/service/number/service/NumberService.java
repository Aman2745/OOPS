package com.bootcoding.oops.service.number.service;

import com.bootcoding.oops.service.number.model.Number;

import java.util.Random;

import static java.lang.Math.random;

public class NumberService {
    //to get the randomnumber
    public Number getRandomNumber(){
        Random random = new Random();
        int n = random.nextInt();
        Number number = new Number();
        number.setNum(n);
        return number;
    }

}
