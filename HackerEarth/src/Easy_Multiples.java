
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
public class Easy_Multiples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of testcases :");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            long sum=0;
        
            long num = in.nextLong();
            for(long j=1;j<num;j++){
                if(j%3 ==0 || j%5==0){
                    sum+=j;
            }
            }
            System.out.println(sum);
       
    }
}
}
        
