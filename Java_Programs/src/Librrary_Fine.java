
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
public class Librrary_Fine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Aday= in.nextInt();
        int Amonth = in.nextInt();
        int Ayear = in.nextInt();
        int Eday = in.nextInt();
        int Emonth = in.nextInt();
        int Eyear = in.nextInt();
        
        int fine =0;
        if(Ayear > Eyear){
            fine = 10000;
        }
        else if(Ayear == Eyear){
            if(Amonth>Emonth){
                fine = 500 *(Amonth - Emonth);
            }
            else if(Amonth==Emonth){
                if(Aday >Eday){
                    fine = 15*(Aday-Eday);
                }
            }
        }
        System.out.println(fine);
    }
}
