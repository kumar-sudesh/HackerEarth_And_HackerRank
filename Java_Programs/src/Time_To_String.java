
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
public class Time_To_String {
    static final String[] DIGITS={"zero","one","two","three","four","five","six","seven","eight","nine"};
    static final String[] TEEN_WORDS={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static final String[] TEN_WORDS={null,"ten","twenty","thirty","fourty","fiftey","sixty","seventy","eighty","ninety"};
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int HOUR = in.nextInt();
        int MIN =in.nextInt();
        
        String time;
        if(MIN==0){
            time = toWords(HOUR)+" o' clock ";
        }
        else if(MIN==1){
            time = toWords(MIN)+" minute past "+ toWords(HOUR);
        }
        else if(MIN==15){
            time = "quarter past "+ toWords(HOUR);
        }
        else if(MIN<30){
            time = toWords(MIN)+ " minutes past "+toWords(HOUR);
        }
        else if(MIN==30){
            time ="half past "+toWords(HOUR);
        }
        else if(MIN==45){
            time = "quarter to "+ toWords(HOUR+1);
        }
        else if(MIN==59){
            time = "one minute past "+toWords(HOUR+1);
        }
        else{
            
            time =toWords(60-MIN)+" minutes to "+toWords(HOUR+1);
        }
        System.out.println(time);
        
    }
    static String toWords(int number){
        if(number>=10 && number<20){
            return TEEN_WORDS[number-10];
        }
        else if(number<10){
            return DIGITS[number];
            
        }
        else if(number%10 ==0){
            return TEN_WORDS[number/10];
        }
        else{
            return TEN_WORDS[number/10]+ " " +DIGITS[number%10];}
    }
}
