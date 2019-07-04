
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
public class Counting_Frog_Paths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x co-ordinates: ");
        int x = in.nextInt();
        System.out.println("Enter the y co-ordinates: ");
        int y = in.nextInt();
        System.out.println("Enter the square size :");
        int s = in.nextInt();
        System.out.println("Enter the time in seconds: ");
        int t =in.nextInt();
        int count=0;
        for(int i=x;i<=x+s;i++){
            for(int j=y;j<=y+s;j++){
                if((i+j)<=t)
                    count++;
                
        }
                
    }
        System.out.println(count);
}
}
