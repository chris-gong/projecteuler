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
public class NumberLetterCounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hundred = 7; //hundred
        int and = 3; //and
        int[] oneThroughNine = {3, 3, 5, 4, 4, 3, 5, 5, 4}; //starting from one, two, ..., nine
        int[] multiplesOfTen = {3, 6, 6, 5, 5, 5, 7, 6, 6}; //starting from ten, twenty, ..., ninety
        int[] elevenThroughNineteen = {6, 6, 8, 8, 7, 7, 9, 8, 8}; //starting from eleven, twelve, ..., nineteen
        int sumOfLetters = 0;
        //one through nine
        for(int i = 0; i < oneThroughNine.length; i++){
            sumOfLetters += oneThroughNine[i];
        }
        //ten through nineteen
        sumOfLetters += multiplesOfTen[0];
        for(int i = 0; i < elevenThroughNineteen.length; i++){
            sumOfLetters += elevenThroughNineteen[i];
        }
        //twenty through nine hundred and ninety nine
        for(int i = 20; i <= 999; i++){
            if((int)(Math.log10(i)+1) > 2){ //Math.log10(i)+1 calculates the number of digits in i
                if(i % 100 == 0){ //cases like 300, 400, etc.
                    sumOfLetters += oneThroughNine[(i / 100) - 1];
                    sumOfLetters += hundred;
                }
                else{
                    sumOfLetters += oneThroughNine[(i / 100) - 1];
                    sumOfLetters += hundred;
                    sumOfLetters += and;
                    if(i % 10 == 0){ //cases like 840, 720, etc.
                        int j = i - (i/100) * 100;
                        sumOfLetters += multiplesOfTen[(j / 10) - 1];
                    }
                    else{
                        if(i % 100 < 20 && i % 20 > 10){ //cases like 111, 215, etc.
                            sumOfLetters += elevenThroughNineteen[(i % 100)-11];
                        }
                        else if(i % 100 < 10){ //cases like 501, 607, etc.
                            sumOfLetters += oneThroughNine[(i % 100) - 1];
                        }
                        else{
                            int j = i - (i/100) * 100;
                            sumOfLetters += multiplesOfTen[(j / 10) - 1];
                            sumOfLetters += oneThroughNine[(j % 10) - 1];
                        }
                    }
                }
            }
            else{
                if(i % 10 == 0){ //cases like 20, 50, 70, etc.
                    sumOfLetters += multiplesOfTen[(i / 10) - 1];
                }
                else{
                    sumOfLetters += multiplesOfTen[(i / 10) - 1];
                    sumOfLetters += oneThroughNine[(i % 10) - 1];
                }
            }
        }
        //1000
        int thousand = 8;
        sumOfLetters += oneThroughNine[1000/1000 - 1] + thousand ;
        System.out.println("Total number of letters in 1 to 1000: " + sumOfLetters);
    }
    
}
