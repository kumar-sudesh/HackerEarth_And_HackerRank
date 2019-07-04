
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
public class Magical_Tree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
        int maxsum=0;
        while(n-->0){
            int sum =0;
            String s = in.next();
            sum = s.charAt(0)-'0';
            
            for(int i=1;i<=s.length()-1;i++){
                if(s.charAt(i)=='+'){
                    sum = sum + (s.charAt(i+1)-'0');
        }
                if(s.charAt(i)=='-'){
                    sum = sum - (s.charAt(i+1)-'0');
                }
    }
            maxsum=Math.max(sum, maxsum);
}
        System.out.println(maxsum);
    }
}
/*130723
7xy255a5*/