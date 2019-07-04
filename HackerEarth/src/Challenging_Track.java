
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
public class Challenging_Track {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
        
        long sum=0;
        for(int i=0;i<n;i++){
            int h = in.nextInt();
            long pvalue = in.nextLong();
            int array[]=new int[h];
            
            for(int j=0;j<array.length;j++){
                array[j]=in.nextInt();
            }
            for(int j=0;j<array.length;j++){
                sum = pvalue-array[j];
                pvalue=sum;
                if(j%2==0){
                   for(int k=j+1;k<=array.length;k++){
                    if(array[k]%2==0){
                        array[k]=array[k]-1;
                    }
                }
                }
                else{
                    for(int k=j+1;k<=array.length;k++){
                    if(array[k]%2==1){
                        array[k]=array[k]-1;
                    }
                }
                }
                //System.out.println(sum);
        }
            //System.out.println(sum);
            if(sum>=0){
                System.out.println("Yes"+" "+sum);
            }
            else{
                System.out.println("No");
            
    }
        
}
}
}