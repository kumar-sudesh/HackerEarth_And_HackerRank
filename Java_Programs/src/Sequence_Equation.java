
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
public class Sequence_Equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] result=new int[n+1];
        
        for(int i=1;i<=n;i++){
            int px =in.nextInt();
            result[px]=i;
        }
        for(int j=1;j<=n;j++){
            int y = result[result[j]];
            System.out.println(y);
        }
        
    }
}
