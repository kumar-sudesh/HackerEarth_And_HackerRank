
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
public class Jump_Out {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers : ");
        int n =in.nextInt();
        int a=0;
        for(int i=0;i<n;i++){
            a = in.nextInt();
            if((n-i)<=a){
                System.out.println(i+1);
                return;
        }
        }
    }
}
