
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
public class Beautiful_Binary_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String s = in.next();
         System.out.println(binary(s));       
    }
    
    static int binary(String binaryString){
        
        return (binaryString.length()-binaryString.replace("010", "01").length());
    }
}
