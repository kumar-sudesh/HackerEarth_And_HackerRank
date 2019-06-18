
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
public class Alternating_Characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s1 = in.next();
            System.out.println(alternating(s1));
        }
    }
    
    static int alternating(String s){
        int deletion =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                deletion++;
    }
}
        return deletion;
    }
}
