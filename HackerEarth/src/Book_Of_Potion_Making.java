
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
public class Book_Of_Potion_Making {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 10 digit integer: ");
        String str = in.next();
        int num=0;
        if(str.length()==10){
            char[]numarray = str.toCharArray();
            for(int i=0;i<10;i++){
                num+=Character.getNumericValue(numarray[i])*(i+1);
            } 
                if(num%11==0){
                    System.out.println("Legal ISBN");
                }
                    else{
                            System.out.println("Illegal ISBN");
                            }
                
        
        }       
            else{
                    System.out.println("Illegal ISBN");
                    }
            
        
        
        
        
        

}
}