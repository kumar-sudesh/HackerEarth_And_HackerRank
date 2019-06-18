
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
public class Viral_Adverstising {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of days :");
        
        int n = in.nextInt();
        int shared =2;
        int liked = 2;
        for(int i=1;i<n;i++){
            liked +=(shared*3)/2;
            shared = (shared*3)/2;
        }
        System.out.println(liked);
    }
    
}
