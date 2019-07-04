
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
public class Best_Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        int[]array=new int[100000];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                
                sum+=array[j];
                
        }
            System.out.println(sum);
    }
}
}
