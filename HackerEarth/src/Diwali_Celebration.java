
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
public class Diwali_Celebration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            int a = in.nextInt();
            int k=in.nextInt();
            int m = in.nextInt();
            sum = a+(k*m)-k;
            System.out.println(sum);
    }
        
}
}
