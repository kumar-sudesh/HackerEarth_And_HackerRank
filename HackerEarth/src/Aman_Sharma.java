
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
public class Aman_Sharma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           System.out.println("Enter the number of days :");
           int n = in.nextInt();
           int count=0;
           for(int i=0;i<n;i++){
               long r = in.nextLong();
               long x = in.nextLong();
               
               long  sum = 44*r;
               long horlickssum = 700*x;
               
               if(sum<=horlickssum){
                   count++;
               }
           }
           System.out.println(count);
    }
}
