
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
public class Digit_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char []ch = s.toCharArray();
        int t = in.nextInt();
        int count=1;
        for(int k=0;k<t;k++){
            int l =in.nextInt();
            int r = in.nextInt();
            
        for(int i=l-1;i<r;i++){
            for(int j=i+1;j<r;j++){
                if(Character.isDigit(ch[i])==Character.isDigit(j)){
                   count++;
            }
               
}
             System.out.println(Character.isDigit(ch[i])+" "+count);
}
    }
    }
}
