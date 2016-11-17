/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NthPrimeNumber {

    /**
     * @param args the command line arguments
     */
    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            i++;
            if(isPrime(i)){
                count++;
            }
            
        }
        System.out.println("The " + n + "th prime number is " + i);
    }
    
}
