
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
public class Array_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers :");
        int n = in.nextInt();
        
        long[] sum = new long[n];
        long result=0;
        for(int i=0;i<n;i++){
            sum[i]=in.nextLong();
            result +=sum[i];
        }
        System.out.println(result);
    }
}
