
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
public class String_Construction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s1 = in.next();
            System.out.println(Stringformation(s1));
        }
    }
    
    static long Stringformation(String s){
        
        return s.chars().distinct().count();
    }
}
