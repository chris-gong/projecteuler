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
public class SumSquareDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sumSquared = 0;
        double sumOfSquares = 0;
        for(int i = 1; i <= 100; i++){
            sumOfSquares += Math.pow(i,2);
        }
        for(int i = 1; i <= 100; i++){
            sumSquared += i;
        }
        sumSquared = Math.pow(sumSquared, 2);
        System.out.println(sumSquared - sumOfSquares);
    }
    
}
