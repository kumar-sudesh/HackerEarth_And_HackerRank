
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
public class Birthday_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int test = in.nextInt();
        for(int i=0;i<test;i++){
            int friends = in.nextInt();
            int chocolates = in.nextInt();
            
            if(chocolates%friends ==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
