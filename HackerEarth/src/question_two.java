
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
public class question_two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        System.out.println("enter the starting number :");
        int start = in.nextInt();
        System.out.println("Enter the ending number :");
        int end = in.nextInt();
        int []array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++){
            for(int i=start;i<=end;i++){
                if(array[j]==i)
                    count++;
            }
            
        }
        if(count==n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
