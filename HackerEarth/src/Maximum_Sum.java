
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
public class Maximum_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        Arrays.sort(array);
        int max =0;
        int min=0;
        for(int i=1;i<n;i++){
            max+=array[i];
        }
        for(int i=0;i<n-1;i++){
            min+=array[i];
        }
        System.out.println(min+" "+max);
    }
}
