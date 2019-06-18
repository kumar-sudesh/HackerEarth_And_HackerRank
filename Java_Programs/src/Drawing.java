
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
public class Drawing {
    public static void main(String[] args) {
        
    
    Scanner number = new Scanner(System.in);
    int n = number.nextInt();
    int p = number.nextInt();
    
    int front = (p/2);
    int end = 0;
    if(n%2 ==1)
    
    end = (n-p)/2;
    else
        end = (int)Math.ceil((n-p)/2.0);
    
        System.out.println(Math.min(front,end));
}
}