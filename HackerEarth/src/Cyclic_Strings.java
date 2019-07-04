
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
public class Cyclic_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
         while(n-->0){
             String s = in.next();
             long sum=0;
             long length = s.length();
             sum=(length *(length+1))/2;
             
             System.out.println(sum);
         }
    }
}
