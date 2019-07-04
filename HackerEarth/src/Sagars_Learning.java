
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
public class Sagars_Learning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int n = in.nextInt();
       // int array[]= new int [n];
        long sum=0;
        for(int i=0;i<n;i++){
            long number = in.nextLong();
            if(number==1 || number==2){
                System.out.println("-1");
            
        }
            else{
                sum=number/3;
                System.out.println(sum+" "+sum*2+" "+sum*3);
    }
}
    }
}
