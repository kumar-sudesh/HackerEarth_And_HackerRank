
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
public class Goki_beakup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
        System.out.println("Enter the minimum qualification :");
        int m = in.nextInt();
        for(int i=0;i<n;i++){
            int s = in.nextInt();
            
            if(s>=m){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        
    }
}
}
