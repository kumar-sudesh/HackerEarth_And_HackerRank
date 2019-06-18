
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
public class Sherlock_Squares {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
      //  System.out.println("Enter the number of test cases: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            
           // System.out.println("Enter the starting integer value: ");
            int m =in.nextInt();
           // System.out.println("Enter the ending integer value: ");
            int  p = in.nextInt();
            
           //int[] result = new int[1000];
           int start = (int) Math.sqrt(m);
           int end = (int)Math.sqrt(p);
           
           int difference = end-start;
            difference +=(Math.pow(start, 2)>m)?1:0;
            System.out.println(difference);
    }
}
}   
