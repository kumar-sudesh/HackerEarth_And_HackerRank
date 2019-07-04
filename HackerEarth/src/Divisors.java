
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
public class Divisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter then first number: ");
        int l = in.nextInt();
        System.out.println("Enter the second number: ");
        int r = in.nextInt();
        System.out.println("Enter the third number for division: ");
        int k = in.nextInt();
        int count =0;
        for(int i=l;i<=r;i++){
          if(i%k==0){
              count++;
          }
            //System.out.println(count);
        }
        System.out.println(count);
}
}
