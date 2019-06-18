
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
public class Mars_Exploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        int currentPos = 0;
        for(char letter : S.toCharArray())
        {
            
            if(currentPos % 3 == 1)
            {
                count += (letter != 'O') ? 1 : 0;
            }
            else
            {
                count += (letter != 'S') ? 1 : 0;
            }
            currentPos++;
        }
        System.out.println(count);
    }
}
