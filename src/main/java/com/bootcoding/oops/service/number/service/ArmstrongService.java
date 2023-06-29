package com.bootcoding.oops.service.number.service;

import com.bootcoding.oops.service.number.model.Number;

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
    public void isArmstrong(Number number) {

        int temp, digits = 0, last = 0, sum = 0;
     //assigning number into a temp variable
        temp = number.getNum();
        //loop execute until the condition becomes false
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = number.getNum();
        while (temp > 0) {
    //determines the last digit from the number
            last = temp % 10;
    //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum += (Math.pow(last, digits));
    //removes the last digit
            temp = temp / 10;
        }
        //returns if sum and n are equal
        //returns false if sum and n are not equal
       if(number.getNum()==sum) {
           number.setArmstrong( "armstrong");
       }else{
          number.setArmstrong( "Not an armstrong");
       }
    }


//returns false if sum and n are not equal

}
