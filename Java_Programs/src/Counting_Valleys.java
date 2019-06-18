
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
public class Counting_Valleys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String s = in.next();
        System.out.println(counting(s));
    }
    static int counting(String s){
        
        int Valley_Number =0;
        int level=0;
        
        for(char p :s.toCharArray()){
            if(level == -1 && p=='U'){
                Valley_Number++;
            }
            if(p=='U'){
                level++;
            }
            else{
                level--;
            }
            
        }
        return Valley_Number;
    }
}
