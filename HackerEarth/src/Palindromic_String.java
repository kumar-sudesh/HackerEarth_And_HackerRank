
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
public class Palindromic_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        String reverse="";
       
        int length = s.length();
        for(int i =length-1;i>=0;i--){
            reverse = reverse + s.charAt(i);        
    }
    if(s.equals(reverse)){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
        
}
    
        
    
}
