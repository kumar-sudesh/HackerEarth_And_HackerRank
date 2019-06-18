
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
public class Array_Rotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number of arrays for rotation:");
        int n = in.nextInt();
       // System.out.println("Enter the number of rotation:");
        int k = in.nextInt()%n;
       // System.out.println("Enter the number of queries");
        int q =in.nextInt();
        int[]a = new int[n];
            for(int i=0;i<n;i++){
                a[i]= in.nextInt();
            }
            for(int j=0;j<q;j++){
                int m = in.nextInt();
                if((m-k)>=0){
                    System.out.println(a[m-k]);
                }
                else{
                    System.out.println(a[(n+(m-k))]);
                }
            }
            
    }
    
}
