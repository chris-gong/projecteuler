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

public class TriangularNumber {

    /**
     * @param args the command line arguments
     */
    static int numberOfDivisors(long num){
        int count = 0;
        for(long i = 1; i * i <= num; i++){
            if(num % i == 0){
                count += 2;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        long over500Divisors = 0;
        long currentTriNum = 0;
        for(long i = 1; i < 100000; i++){
            currentTriNum += i;
            
            if(numberOfDivisors(currentTriNum) > 500){
                over500Divisors = currentTriNum;
                break;
            }
        }
        System.out.println(over500Divisors);
    }
    
}
