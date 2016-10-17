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
public class LargestPalindromeProduct {

    /**
     * @param s
     * @return 
     */
    public static boolean isPalindrome(String s){
        
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int largestProd = 0;
        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                String prod = String.valueOf(i*j);
                if(isPalindrome(prod) && i * j > largestProd){
                    largestProd = i * j;
                }
            }
        }
        System.out.println(largestProd);
    }
    
}
