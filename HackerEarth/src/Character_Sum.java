
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
public class Character_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.next();
        int length = s.length();
        int sum=0;
        for(int i=0;i<length;i++){
            sum+= s.charAt(i)-96;
    }
        System.out.println(sum);
}
}