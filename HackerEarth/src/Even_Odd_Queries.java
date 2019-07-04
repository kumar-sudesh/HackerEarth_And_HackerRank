
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
public class Even_Odd_Queries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n =in.nextInt();
        long[]array= new long[10000000];
        array[0]=0;
        for(int i=1;i<=n;i++){
           // System.out.println("Enter the number of integers :");
           int n1 = in.nextInt();
            //System.out.println("Enter the number of queries :");
            int n2 = in.nextInt();
            for(int j=1;j<=n1;j++){
                array[j]=in.nextInt();
            }
            for(int j=1;j<=n2;j++){
               // System.out.println("Enter the value 0 or 1: ");
                int k=in.nextInt();
               // System.out.println("Enter the starting range: ");
                int start = in.nextInt();
                //System.out.println("Enter the ending range :");
                int end = in.nextInt();
                int count=0;
                if(k==0){
                    for(int m=start;m<=end;m++){
                        if(array[m]%2==0){
                            count++;
            }
                        
    }
                    if(count==0 || count==(end-start+1)){
                            System.out.println(count);
                            
                        }
                      
                        else{
                        System.out.println(count +" "+ (end-start+1));
                        
                        }
                   
}
                if(k==1){
                    for(int m=start;m<=end;m++){
                        if(array[m]%2==1){
                            count++;
                }
                       
}
                    if(count==0 || count==(end-start+1)){
                            System.out.println(count);
                            
                        }
                       
                        else{
                        System.out.println(count +" "+ (end-start+1));
                        
                        } 
                   
                }
            }
        }
    }
}
