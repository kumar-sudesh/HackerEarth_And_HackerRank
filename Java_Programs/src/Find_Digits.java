
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
public class Find_Digits {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String numberString = String.valueOf(in.nextInt());
            int Stringvalue = Integer.parseInt(numberString);
            int evenlydigits =0;
            
            for(int j=0;j<numberString.length();j++){
                int digits = Character.getNumericValue(numberString.charAt(j));
                if(digits!=0 && (Stringvalue)%digits ==0){
                    evenlydigits++;
                }
            }
            System.out.println(evenlydigits);
    }
}
}
