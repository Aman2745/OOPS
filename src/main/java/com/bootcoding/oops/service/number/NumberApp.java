package com.bootcoding.oops.service.number;

import com.bootcoding.oops.service.number.model.Number;
import com.bootcoding.oops.service.number.service.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class NumberApp {

    public static void main(String[] args) throws Exception{
        NumberService ns = new NumberService();
        EvenOddService eos = new EvenOddService();
        PalindromeService ps = new PalindromeService();
        PrimeNumberService pns = new PrimeNumberService();
        ArmstrongService armstrongService=new ArmstrongService();
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Softwares\\interface/numbers.csv"));

        ArrayList<Number> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Number randomNumber = ns.getRandomNumber();
            eos.evenOdd(randomNumber);
            ps.palindrome(randomNumber);
            pns.primeNumber(randomNumber);
            armstrongService.isArmstrong(randomNumber);
            numbers.add(randomNumber);

        }

        for(Number number : numbers) {
            writer.write(number.toString());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
}

