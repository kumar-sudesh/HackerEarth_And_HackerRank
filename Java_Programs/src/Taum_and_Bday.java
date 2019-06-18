
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
public class Taum_and_Bday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            long nblackgifts = in.nextInt();
            long nwhitegifts = in.nextInt();
            long cblackgifts = in.nextInt();
            long cwhitegifts = in.nextInt();
            long conversionCost = in.nextInt();
            
            long minblackprice = Math.min(cblackgifts, cwhitegifts+conversionCost);
            long minwhiteprice = Math.min(cwhitegifts,cblackgifts+conversionCost);
            
            System.out.println((minblackprice*nblackgifts) + (minwhiteprice*nwhitegifts));
            
        }
    }
}
