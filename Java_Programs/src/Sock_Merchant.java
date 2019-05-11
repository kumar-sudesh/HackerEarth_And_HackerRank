
import java.util.HashMap;
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
public class Sock_Merchant {
    
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number of socks randomly");
        int number1 = number.nextInt();
        int sock_pair_count = 0;
        HashMap count = new HashMap<Integer,Integer>();
        
        for(int i = 0;i<number1;i++){
            System.out.println("Enter the number of colors");
            int color = number.nextInt();
            
            if(count.containsKey(color)&&count.get(color).equals(new Integer(1))){
                count.put(color,0);
                sock_pair_count++;
                continue;
            }
            count.put(color, 1);
        }
        System.out.println(sock_pair_count);
    }
}
