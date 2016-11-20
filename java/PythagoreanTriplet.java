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
public class PythagoreanTriplet {

    /**
     * @param args the command line arguments
     */
    static boolean isPythagoreanTriplet(int a, int b, int c){
        return Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
    }
    static double findMissingPythagorean(int a, int b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
    }
    public static void main(String[] args){
        // TODO code application logic here
        int triplet = 0;
        for(int i = 3; i < 1000; i++){
            for(int j = i + 1; j < 1000; j++){
                double k = findMissingPythagorean(i, j);
                if(k % 1 == 0 && i + j + k == 1000){
                    System.out.println(i + " " + j + " " + k);
                    System.out.println(i * j * k);
                }
            }
        }
        
    }
    
}
