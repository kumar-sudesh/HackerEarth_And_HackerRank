
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
public class Monk_Takes_a_walk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
        
        for(int i=0;i<n;i++){
           int count=0;
            String s = in.next();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='A' || s.charAt(j)=='E'|| s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'||s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
                {
                    count++;
                }
            }
            System.out.println(count);
          
    }
}
}
