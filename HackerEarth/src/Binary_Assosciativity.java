
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
public class Binary_Assosciativity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbere of test cases :");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int one = in.nextInt();
            int two = in.nextInt();
            int three = in.nextInt();
            int four=in.nextInt();
            
            if(one==1 && two==0 && three==0 && four==0){
                System.out.println("No");
    }
            else if(one==1 && two==1&& three ==1 && four==0){
                System.out.println("No");
}
            else if(one==1 && two==0&& three ==1 && four==1){
                System.out.println("No");
            
            }
             else if(one==1 && two==0&& three ==1 && four==0){
                System.out.println("No");
            
            }
             else if(one==0 && two==1&& three ==1 && four==0){
                System.out.println("Yes");
            
            }
              else if(one==0 && two==1&& three ==0 && four==0){
                System.out.println("No");
            
            }
               else if(one==0 && two==0&& three ==1 && four==0){
                System.out.println("No");
            
            }
               
               else if(one==1&& two==1&& three ==0&& four==0){
                System.out.println("No");
            
            }
                else if(one==1&& two==1&& three ==0&& four==1){
                System.out.println("No");
            
            }
            
            else{
                System.out.println("Yes");
            }
        }
    }
}
          
