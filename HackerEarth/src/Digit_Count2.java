
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
public class Digit_Count2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        int length = str.length();
        int[ ]freq = new int[26];
        for(int i=0;i<length;i++){
            freq[str.charAt(i)-48]++;
        }
        for(int i=3;i<=5;i++){
            if(freq[str.charAt(i)-48]!=0){
                System.out.println(str.charAt(i)+" "+ freq[str.charAt(i)-48]);
                
                freq[str.charAt(i)-48]=0;
                
            
            
            }
            System.out.println(Math.max(freq[str.charAt(i)-48], 0));
}
        
}
    }

