
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
public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int m =in.nextInt();
            int star = 1;
            int space =m-1;
            for(int j=1;j<=m;j++){
                
                for(int k=1;k<=space;k++){
                    System.out.print(" ");
                }
                space--;
                for(int l=1;l<=star;l++){
                    System.out.print("*");
                }
                System.out.println();
                star=star+2;
            }
    }
}
}
