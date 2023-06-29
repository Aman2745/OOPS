package com.bootcoding.oops.service.number;

import com.bootcoding.oops.service.number.service.*;

public class NumberApp {
    public static void main(String[] args) {
     for(int i=0;i<5;i++){
         NumberService numberService=new NumberService();
         int n=numberService.getRandomNumber(1);
//         System.out.println(n);

         ArmstrongService armstrongService=new ArmstrongService();
         System.out.println("ArmStrongNumber :"+armstrongService.isArmstrong(n));

         EvenOddService evenOddService=new EvenOddService();
         System.out.println("Even or Odd :"+evenOddService.isEvenOdd(n));

         PrimeNumberService primeNumberService=new PrimeNumberService();
         primeNumberService.isprimenumber(n);

         PalindromeService palindromeService=new PalindromeService();
         palindromeService.ispalindrome(n);


         System.out.println();
     }

    }
}
