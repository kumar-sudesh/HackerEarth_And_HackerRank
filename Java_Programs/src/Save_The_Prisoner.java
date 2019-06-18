
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
public class Save_The_Prisoner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        
        int n = in.nextInt();
        int p;
        int q;
        int r =0;
        int result =0;
        for(int i=0;i<n;i++){
            p=in.nextInt();
            q = in.nextInt();
            r = in.nextInt();
        
              int diff = q%p;
              if((r+diff-1)%p==0){
                  System.out.println(p);
              }
              else{
                  System.out.println((r+diff-1)%p);
              }
            
        }
     
    }
}
