
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
public class Two_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            
            String s1 = in.next();
            String s2 = in.next();
            
            Set<Character>s11 = new HashSet<>();
            Set<Character>s22 = new HashSet<>();
            
            for(int j=0;j<s1.length();j++){
                s11.add(s1.charAt(j));
            }
            for(int k=0;k<s2.length();k++){
                s22.add(s2.charAt(k));  
                
            }
            
             s11.retainAll(s22);
             if(s11.size()>0){
                 System.out.println("YES");
             }
             else{
                 System.out.println("NO");
             }
            
            
        }
    }
}
