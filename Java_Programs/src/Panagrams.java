
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
public class Panagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        
        String s = in.nextLine();
        System.out.println(panagram(s)?"pangram":"not pangram");
       
    }
    
    public static boolean  panagram(String sentence){
         String letter = sentence.toLowerCase();
         for(char i = 'a';i<='z';i++){
             if(letter.indexOf(i)<0)
                 return false;
             
         }return true;
    


    }
}
       
            
            
            
  