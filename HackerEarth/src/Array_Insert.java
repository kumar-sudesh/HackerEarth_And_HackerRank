
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
public class Array_Insert {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers :");
        int n = in.nextInt();
        System.out.println("Enter the number of queries :");
        int q = in.nextInt();
        int []array = new int[n];
        
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
    }
        for(int i=0;i<q;i++){
            int queryno = in.nextInt();
            int index = in.nextInt();
            int value = in.nextInt();
            int sum=0;
           
               if(queryno==1){
                    array[index]=value;
                }
                else if(queryno==2){
                    for(int k=index;k<=value;k++){
                        sum +=array[k];
                }
                    System.out.println(sum);
                
        }
}
    }
}
