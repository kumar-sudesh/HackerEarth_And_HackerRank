
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
public class Find_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers for multiplication: ");
        
        int n = in.nextInt();
        long  []num_storage=new long[n];
        long s=1;
        long modulo = 1000000007;
        long result =0;
        for(int i=0;i<n;i++){
            num_storage[i]=in.nextLong();
            s =((s* num_storage[i])%modulo);
            
        }
        System.out.println(s);
    }
}
