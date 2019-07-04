
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
public class Little_jhool_cycic_powers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int count=0;
        String []array=new String[str.length()];
         for(int i=1;i<str.length()-1;i++){
            if(array[i]==array[i+1]){
                count++;
         }
            else{
                count=0;
            }
         
            if(count==5){
                break;
            }
       
        
    }
         if(count==5){
             System.out.println("Sorry, sorry!");
         }
         else{
             System.out.println("Good luck!");
}
}
}

