
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
public class String_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s = in.next();
            char[] ch = s.toCharArray();
            int length = s.length();
            int count=1;
            for(int j=0;j<length-1;j++){            
                for(int k=j+1;k<=length-1;k++){
                    count=1;
                    if(ch[k]-'a'==ch[j]-'a')
                    {
                    
                    count++;
                    }
                     
                }
               System.out.println(s.charAt(j)+" "+count);
               
               
    }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<length-1;j++){
                if( count%2==0 ||count%2==1){
                    
                    
                    sb.append(ch[j]);
            }
            
}
            String string = sb.toString();
            System.out.println(string);
            if(string.length()%2==0){
                System.out.println("Player2");
            }
            else{
                System.out.println("Player1");
            }
    }
}
}
