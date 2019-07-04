
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
public class Toggle_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
      //  System.out.println("Entger the string to be toggled: ");
        String s = in.next();
        char[]ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)((int)ch[i]+32);
            }
            else if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)((int)ch[i]-32);
            }
        }
       // System.out.println("Toggled String is: ");
        for(int i=0;i<s.length();i++){
            System.out.print(ch[i]);
        }
    }
}
