/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author User
 */
public class LargestPrimeFactor {

    /**
     * @param args the command line arguments
     */
    public static long largestPrimeFactor(long num){
        long factor = 0;
        for(long i = 2; i <= Math.sqrt(num); i++){
            if(isPrime(i) && num % i == 0){
                factor = i;
            }
        }
        return factor;
    }
    public static boolean isPrime(long num){
        if(num == 2){
            return true;
        }
        if(num < 2){
            return false;
        }
        if(num % 2 == 0){
            return false;
        }
        for(long i = 3; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(largestPrimeFactor(600851475143L));
    }
    
}
