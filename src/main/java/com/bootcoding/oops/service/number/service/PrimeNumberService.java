package com.bootcoding.oops.service.number.service;

import com.bootcoding.oops.service.number.model.Number;

public class PrimeNumberService {
    public void primeNumber(Number number){

        for(int i = 2; i < number.getNum()/2; i++){
            if(number.getNum() % i == 0){
                number.setPrimeNumber("NOT PRIME NUMBER");
                return;
            }
        }
        number.setPrimeNumber("PRIME NUMBER");
    }
}
