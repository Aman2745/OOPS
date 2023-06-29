package com.bootcoding.oops.service.number.service;
/*
* Input : 153
Output : Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153

Input : 120
Output : No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input : 1253
Output : No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723

Input : 1634
Output : Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

* */
public class ArmstrongService {

    //function to check if the number is Armstrong or not
    public boolean isArmstrong(int n) {

        int temp, digits = 0, last = 0, sum = 0;
     //assigning n into a temp variable
        temp = n;
        //loop execute until the condition becomes false
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
    //determines the last digit from the number
            last = temp % 10;
    //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum += (Math.pow(last, digits));
    //removes the last digit
            temp = temp / 10;
        }
    //compares the sum with n
        if (n == sum)
//returns if sum and n are equal
            return true;
//returns false if sum and n are not equal
        else return false;
    }
}