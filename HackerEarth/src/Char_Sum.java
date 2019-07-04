
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
public class Char_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //char[] array = new char[1000];
        int sum=0;
        int length = str.length();
        for(int i=0;i<length;i++){
           sum+= str.charAt(i)-'a'+1;
        
    }
        System.out.println(sum);
}
}
