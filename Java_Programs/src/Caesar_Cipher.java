
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
public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lenght of string:");
        int n =in.nextInt();
        String s = in.next();
        System.out.println("Enter the encryption shift integer:");
        int k=in.nextInt();
        StringBuilder sp = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch =(char)((ch-'a'+k)%26+'a');
        }
           else if(Character.isUpperCase(ch)){
                ch = (char)((ch-'A'+k)%26+'A');
            }
            sp.append(ch);
 }
        System.out.println(sp);
}
}
