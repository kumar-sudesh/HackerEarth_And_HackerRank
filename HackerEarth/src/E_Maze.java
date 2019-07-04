
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
public class E_Maze {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            switch(c){
                case('L'):
                    x=x-1;
                    break;
                 case('R'):
                     x=x+1;
                     break;
                  case('U'):
                      y=y+1;
                      break;
                   case('D'):
                       y=y-1;
                       break;
                       
                   default:
                       break;
                    
            }
        }
        System.out.println(x+" "+y);
    }
}
