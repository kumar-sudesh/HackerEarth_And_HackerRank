
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
public class Let_Us_Understand_Computer  {
    public static void main(String[] args) throws Exception{
        /*Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of testcases :");
        long n = in.nextLong();*/
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            long count=0;
            long sum=0;
            long num=Long.parseLong(br.readLine());
            for(int j=2;j<=num;j++){
                sum = (long) Math.floor(num/j);
               count++;
               
            }
            sb.append(count);
                    System.out.println(sb);
        }

    }
}
