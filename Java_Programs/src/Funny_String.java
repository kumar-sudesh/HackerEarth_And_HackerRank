
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
public class Funny_String {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the test cases: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s1 = in.next();
            System.out.println(funny(s1)?"Funny":"Not Funny");
        }
    }
    static boolean funny(String s){
        
        for(int i=1,j=s.length()-2 ; i<=j ;i++ ,j--){
        int right = Math.abs(s.charAt(i)-s.charAt(i-1));
        int left = Math.abs(s.charAt(j)-s.charAt(j+1));
        if(right!=left){
            return false;
    }
        
}
        return true;
    }
}
