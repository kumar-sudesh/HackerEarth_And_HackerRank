
import java.lang.reflect.Array;
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
public class Picking_Numbers {
    static final int LIMIT =100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int n = in.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
           num[i]=in.nextInt();
    }
        System.out.println(picking(num));
    }
    static int picking(int[]a){
        int count[]=new int[LIMIT];
        for(int number:a){
            count[number]++;
        }
        int result = Arrays.stream(count).max().getAsInt();
        for(int i=0;i+1<count.length;i++)
        {
            result = Math.max(result,count[i]+count[i+1]);
        }  
        return result;
}
}
