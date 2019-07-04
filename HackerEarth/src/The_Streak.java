
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
public class The_Streak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of tests cases :");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            if(num%21==0){
                System.out.println("The streak is broken!");
        }
            else if(num%21!=0){
                String s = Integer.toString(num);
                //char []array = s.toCharArray();
                if(s.contains("21")){
                    System.out.println("The streak is broken!");
             
                }
                     else{
                        System.out.println("The streak lives still in our heart");
                }
    }
}
           
            
        }
    }

