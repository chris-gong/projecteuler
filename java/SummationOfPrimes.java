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
public class SummationOfPrimes {

    /**
     * @param args the command line arguments
     */
    static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        else if(num < 2){
            return false;
        }
        else{
            for(int i = 2; i <= Math.sqrt(num); i++){ //or i * i <= num
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        long sum = 0;
        for(int i = 2; i < 2000000; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
}
