/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LatticePaths {

    /**
     * @param args the command line arguments
     */
    public static BigInteger factorial(BigInteger num){
        if(num.longValue() < 2){
            return BigInteger.valueOf(1);
        }
        return num.multiply(factorial(num.subtract(BigInteger.valueOf(1))));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        BigInteger n = new BigInteger(String.valueOf(num*2));
        BigInteger k = new BigInteger(String.valueOf(num));
        BigInteger nCk = (factorial(n).divide(factorial(k))).divide(factorial(k));
        
        System.out.println("There are " + nCk + " routes in a " + num
                            + " by " + num + " grid");
    }
    
}
