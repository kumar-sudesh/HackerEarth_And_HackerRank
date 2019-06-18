
import java.math.BigInteger;
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
public class Extra_Long_Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger  factorial=BigInteger.ONE;
        int extralong = in.nextInt();
        for(int i=2;i<=extralong;i++){
            factorial =factorial.multiply(BigInteger.valueOf(i));
        
    }
        System.out.println(factorial);
}
}
