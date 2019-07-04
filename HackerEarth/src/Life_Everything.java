
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
public class Life_Everything {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[]=new int[10000];
        
        for(int i=0;i<100;i++){
            array[i]=in.nextInt();
            if(array[i]!=42){
                System.out.println(array[i]);
            }
            else{
                break;
            }
            
            
    }
}
}
