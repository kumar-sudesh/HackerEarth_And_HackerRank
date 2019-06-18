
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
public class Hurdle_race {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter the number of hurdles: ");
        int n = in.nextInt();
        //System.out.println("Enter the maximum height that Dan can Jump:");
        int m = in.nextInt();
        int[] hurdle_num = new int[n];
         
        
         
         for(int i=0;i<n;i++){
             hurdle_num[i]=in.nextInt();
            // System.out.println(hurdle_num[i]);
         }
         
         int max = hurdle_num[0];
         for(int i=0;i<n;i++){
             
             if(hurdle_num[i]>max){
                 max=hurdle_num[i];
             }
         }
         
        //System.out.println(max);
        if(max>m){
            max= max-m;
            System.out.println(max);
        }
        else{
            System.out.println(0);
        }
}
}
