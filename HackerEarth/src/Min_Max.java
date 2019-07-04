
import java.util.Arrays;
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
public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = in.nextInt();
        int []array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        Arrays.sort(array);
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            min=array[0];
            max = array[n-1];
        }
        //System.out.println(min +" "+max);
       int count=0;
        
            for(int j=1;j<n;j++){
                
                if(min+1==array[j]){
                    min=array[j];
                    count++;
                }
                
               
            }
            System.out.println((min==max)?"YES":"NO");
        }
            
}

