
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
public class Bricks_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of bricks :");
        int n = in.nextInt();
        String currentperson = "Patlu";
        int step =1;
        int initialvalue = 1;
        int bricksmoved =0;
        
        while((n-bricksmoved)>0){
            if((step%2)!=1){
                currentperson = "Patlu";
                bricksmoved =bricksmoved +initialvalue; 
               // System.out.println(bricksmoved +"P");
            }
            else{
                currentperson = "Motu";
                bricksmoved = bricksmoved + (2*initialvalue);
                initialvalue =initialvalue +1;
            }
            step = step +1;
    }
        System.out.println(currentperson);
}
}
