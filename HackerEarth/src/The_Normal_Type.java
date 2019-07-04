
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
public class The_Normal_Type {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        int array[]=new int[n+1];
        array[0]=0;
        for(int i=1;i<=n;i++){
            array[i]=in.nextInt();
        }
        Arrays.sort(array);
        int count=0;
        for(int i=1;i<=n;i++){
            while(i<n && array[i]==array[i+1]){
                i++;
            }
            count++;
        }
        System.out.println(count);
    }
}
