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
public class SmallestMultiple {

    /**
     * @param args the command line arguments
     */
    public static boolean isMultiple1to20(int num){
        for(int j = 2; j <= 20; j++){
                if(num % j != 0){
                    return false;
                }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int smallestMult = 0;
        for(int i = 2521; i < 2147483647; i++){
            
            if(isMultiple1to20(i)){
                smallestMult = i;
                break;
            }
            
        }
        System.out.println(smallestMult);
    }
    
}
