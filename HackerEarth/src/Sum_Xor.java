
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
public class Sum_Xor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        long n = in.nextLong();
        for(int i=0;i<n;i++){
            long num = in.nextLong();
            long count=0;
                long  sum=1;
            while(num>0){
                
            
                if(num%2==0)
                    count++;
                num=num/2;
            }
            while(count-->0){
                sum=sum*3;
            }
            System.out.println(sum);
    }
}
}
