
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
public class Two_Characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of a string: ");
        int n = in.nextInt();
        System.out.println("Enter the String :");
        String s = in.next();
        int mlength =0;
        
        if(s.length()==1){
            System.out.println(mlength);
            System.exit(0);
        }
        
        for(int i=0;i<s.length();i++){
           nextletter:
            for(int j=i+1;j<=n;j++){
                
                char firstc = (char)('a'+i);
                char secondc =(char)('a'+j);
                char lastseen = '\u0000';
                int length =0;
                
                for(char letter:s.toCharArray()){
                    if(letter ==firstc || letter==secondc){
                        if(letter==lastseen){
                            continue nextletter;
                        }
                        length++;
                        lastseen=letter;
                    }
                }
                mlength=(length>mlength)?length:mlength;
            }
        }
        System.out.println(mlength);
    }
}
