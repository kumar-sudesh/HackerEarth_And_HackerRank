
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
public class Roy_and_profile_Picture {
    
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the dimension of length of a square: ");
           int l = in.nextInt();
           System.out.println("Enter the number of test cases: ");
           int n = in.nextInt();
           
           for(int i=0;i<n;i++){
               int w=in.nextInt();
               int h = in.nextInt();
               if(w<l || h<l){
                   System.out.println("UPLOAD ANOTHER");
               }
               else if(w>l && h>l){
                   if(w==h){
                       System.out.println("ACCEPTED");
                   }
                   else{
                       System.out.println("CROP IT");
                   }
               }
               else if(w>l && h==l){
                   System.out.println("CROP IT");
               }
               else if(w==l && h>l){
                   System.out.println("CROP IT");
                          }
               
               else{
                   System.out.println("ACCEPTED");
    }
   
    
}
    }
}
