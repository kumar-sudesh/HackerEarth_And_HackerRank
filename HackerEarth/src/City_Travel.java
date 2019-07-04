
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
public class City_Travel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance: ");
        int n = in.nextInt();
        System.out.println("Enter the max kilometeres travel in a day: ");
        int travel = in.nextInt();
        System.out.println("Enter the number of exceptions :");
        int exception = in.nextInt();
        int[]array = new int[100000];
        int sum=0;
        int count=0;
      
             
            for(int i=0;i<exception;i++){
            int day = in.nextInt();
            int kilometers = in.nextInt();
            while(sum>=n){
                    
                count++;
                if(count==day){
                    sum+=kilometers;
                    
                }
                else{
                    sum+=travel;
                    
                }
                 System.out.println(count);
    }
            
        }
       
}
}
