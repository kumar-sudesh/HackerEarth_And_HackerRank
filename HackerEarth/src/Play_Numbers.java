
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
public class Play_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        long n = in.nextLong();
        System.out.println("Enter the queries:");
        long q =in.nextLong();
        long array[];
        array = new long[1000000];
        array[0]=0;
        for(int i=1;i<=n;i++){
            int temp;
            temp= in.nextInt();
            array[i]=array[i-1]+temp;
        }
        for(int i=0;i<q;i++){
            int lt=0,rt=0;
             lt=in.nextInt();
             rt=in.nextInt();
             long sum=0;
            sum = array[rt]-array[lt-1];
   
                long d = (rt-lt)+1;
                System.out.println(sum/d);
 }
 
      
      
}
}
