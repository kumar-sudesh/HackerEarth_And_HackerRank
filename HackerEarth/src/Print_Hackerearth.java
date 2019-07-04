
import java.util.Arrays;
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
public class Print_Hackerearth {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of characters for the string:");
        int n = in.nextInt();
        System.out.println("Enter the String:");
        String s = in.next();
        int h=0,a=0,c=0,k=0,e=0,r=0,t=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='h'){
                h++;
            }
            else if(ch=='a'){
                a++;
            }
            else if(ch=='c'){
                c++;
            }
            else if(ch=='k'){
                k++;
            }
            else if(ch=='e'){
                e++;
            }
            else if(ch=='r'){
                r++;
            }
            else if(ch=='t'){
                t++;
            }
        }
        
        h=h/2;
        a=a/2;
        c=c/1;
        k=k/1;
        e=e/2;
        r=r/2;
        t=t/1;
        
        int []x =new int[7];
        x[0]=h;
        x[1]=a;
        x[2]=c;
        x[3]=k;
        x[4]=e;
        x[5]=r;
        x[6]=t;
        
        Arrays.sort(x);
        System.out.println(x[0]);
    }
    
}
