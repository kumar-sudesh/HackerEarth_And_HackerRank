
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
public class Supre_Reduced_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to be reduced: ");
        String s = in.next();
        
        for(int i=1;i<s.length();i++){
            
            if(s.charAt(i)==s.charAt(i-1)){
           s= s.substring(0, i-1)+s.substring(i+1);
            i=0;
                //System.out.println(s);
        }
    }
        if(s.length()==0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
}
}