
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
public class Mars_Exploration2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        System.out.println(mars(s));
    }
    
    static int mars(String message){
        String sos ="SOS";
        int count=0;
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) != sos.charAt(i%3)){
                count++;
            }
        }
        return count;
    }
}
