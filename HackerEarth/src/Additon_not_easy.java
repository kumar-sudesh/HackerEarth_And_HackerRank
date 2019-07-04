
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
public class Additon_not_easy {
    public static void main(String args[] ){
Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                while(n>0){
                String p1 = s.next();
                int i = 0;
                while(i<p1.length()){
                int a = p1.charAt(i)-96;
                    int b = p1.charAt(p1.length()-i-1)-96;
                    int c = a+b;
                    if(c<=26)
                    System.out.print((char)(c+96));
                    else {
                    c -= 26;
                    System.out.print((char)(c+96));
            }
                             i++;
            }
                        System.out.println();
                    n--;
            }
            }
}
