
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
public class Beautiful_Days {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the starting day number :");
        int m = in.nextInt();
        //System.out.println("Enter the ending day number:");
        int n = in.nextInt();
       // System.out.println("Enter the divisor:");
        int d = in.nextInt();
        int count=0;
        for(int i=m;i<=n;i++){
          StringBuilder s = new StringBuilder(String.valueOf(i))  ;
          int ireverse = Integer.parseInt(s.reverse().toString());
          
          if(Math.abs(i-ireverse)% d ==0){
              count++;
          }
          
    }
        System.out.println(count);
    }  
}
