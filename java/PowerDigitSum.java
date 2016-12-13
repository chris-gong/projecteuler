/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class PowerDigitSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger num = BigInteger.valueOf(2);
        for(int i = 1; i < 1000; i++){
            num = num.multiply(BigInteger.valueOf(2));
        }
        BigInteger sum = BigInteger.valueOf(0);
        for(int i = 0; i < num.toString().length(); i++){
            sum = sum.add(BigInteger.valueOf(Character.getNumericValue(num.toString().charAt(i))));
        }
        System.out.println("The sum of the digits in 2^1000 is " + sum);
    }
    
}
