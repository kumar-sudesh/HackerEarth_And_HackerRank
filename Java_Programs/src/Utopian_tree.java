
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
public class Utopian_tree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int m = in.nextInt();
        
      
      int testcase_number;
        for(int i=0;i<m;i++){
           int height=1;
            int count=0;
           testcase_number  = in.nextInt();
            while(count<testcase_number){
                if(count<testcase_number){
                    height = height*2;
                    count++;
                }
                if(count<testcase_number){
                    height=height+1;
                    count++;
                }
            }
            System.out.println(height);
        }
        
        //System.out.println(height);
    }
}
