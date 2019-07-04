import java.util.Arrays;
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
public class Two_Strings {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int n = in.nextInt();
        
        for(int i=0;i<n;i++){
            String s1 = in.next();
            String s2 = in.next();
            
            char[]c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            String s11 = new String(c1);
            String s22 = new String(c2);
            
            if(s11.equals(s22)){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            
        
    }
}
}
