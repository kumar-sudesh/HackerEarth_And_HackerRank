
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
public class Digit_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        System.out.println("Number of times a digit can be exchanged: ");
        int k=in.nextInt();
        String s = Long.toString(n);
        char[]array = s.toCharArray();
        int i=0;
        int j=0;
        while(i<k && j<array.length){
            if(array[j]!='9'){
                array[j]='9';
                i++;
        }
            j++;
    }
        System.out.print(array);
}
}
