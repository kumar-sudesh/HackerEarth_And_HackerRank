
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
public class The_Great_Kian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter then number of integers: ");
        int n = in.nextInt();
        
        long array[]= new long[100000];
        for(int i=0;i<n;i++){
            array[i]= in.nextInt();
        }
        long sum =0;
        long sum1=0;
        long sum2=0;
        for(int i=0;i<=n;i+=3){
            sum += array[i];
        }
       for(int i=1;i<n;i+=3){
           sum1+=array[i];
       }
       for(int i=2;i<n;i+=3){
           sum2+=array[i];
       }
        System.out.print(sum +" "+sum1+" "+ sum2);
    }
}
