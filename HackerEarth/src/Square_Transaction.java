
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
public class Square_Transaction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of transactions in a day: ");
        int n = in.nextInt();
        int[]array = new int[n+1];
        array[0]=0;
        for(int i=1;i<=n;i++){
            array[i]=in.nextInt();
        }
        
        int queries = in.nextInt();
        int z=0;
        for(int i=0;i<queries;i++){
            int q = in.nextInt();
            int sum=0;
            for(int j=1;j<=n;j++){
                sum+=array[j];
               if(sum<q){
                   z=-1;
               }
               else{
                   z=j;
                   break;
               
    }
}
            System.out.println(z);
    }
}
}
