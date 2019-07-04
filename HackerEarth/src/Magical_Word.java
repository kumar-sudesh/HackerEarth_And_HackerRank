
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
public class Magical_Word {
    public static void main(String[] args) {
        
    
    int arr[]= { 67,71,73,79,83,89,97,101,103,107,109,113};
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            int start =67;
            in.nextInt();   
            char[]array = in.next().toCharArray();
            for(char ch:array){
                int diff =400;
                
                for(int j=0;j<arr.length;j++){
                    int tdiff = Math.abs(ch-arr[j]);
                    
                    if(tdiff<diff){
                        start=arr[j];
                        diff=tdiff;
                    }
                }
                System.out.print((char)start);
        }
}
}
}