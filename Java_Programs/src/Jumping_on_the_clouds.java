
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
public class Jumping_on_the_clouds {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=in.nextInt();
        }
        int energy = 100;
        int clouds =0;
        
        do{
            
            clouds=(clouds+k)%n;
            System.out.println(clouds);
            energy--;
            if(c[clouds] == 1){
                energy -= 2;
            }
        }while(clouds!=0);
          System.out.println(energy);      
    }
}
