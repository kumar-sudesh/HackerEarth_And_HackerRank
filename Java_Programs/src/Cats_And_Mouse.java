
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
public class Cats_And_Mouse {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
        
            int diffA = Math.abs(x-y);
            int diffB = Math.abs(y-z);
        
            if(diffA < diffB)
            {
                System.out.println("Cat A");
            }
            else if(diffB < diffA){
                
            
                System.out.println("Cat B");
            }
            else{
                System.out.println("Mouse C");
            }
        }
}
}