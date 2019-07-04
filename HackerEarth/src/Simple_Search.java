
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
public class Simple_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        int[]array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
            
        }
        int num = in.nextInt();
        for(int i=0;i<n;i++){
            if(array[i]==num){
                System.out.println(i);
            }
        }
    }
}
