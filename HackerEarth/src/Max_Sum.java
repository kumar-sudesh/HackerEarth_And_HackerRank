
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
public class Max_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        long array[]= new long[n];
        long sum=0;
        
        for(int i=0;i<n;i++){
            array[i]=in.nextLong();
        }
       
        long countsum=0;
        long  count=0;
        for(int i=0;i<n;i++){
         if(array[i]>=0){
             countsum+=array[i];
             count++;
         }
         
        
    }
        if(countsum==0){
             Arrays.sort(array);
             System.out.println(array[n-1]+" "+"1");
        }
         else{
             System.out.println(countsum+" "+count);
         }
}
}
