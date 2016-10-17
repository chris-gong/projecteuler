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
public class EvenFibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int one = 1;
        int two = 2;
        while(one < 4000000 && two < 4000000){
            if(two % 2 == 0){
                sum += two;
            }
            int temp = one;
            one = two;
            two = temp + two;
        }
        System.out.println(sum);
    }
    
}
