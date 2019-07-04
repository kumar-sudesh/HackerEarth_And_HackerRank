
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
public class Sort_the_url {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of urls");
        int n = in.nextInt();
        String s[]=new String[n];
        int scount=0;
        for(int i=0;i<n;i++){
            s[i]=in.next();
        }
        Arrays.sort(s);
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(s[i].equals(s[j])){
                count=count+1;
                s[j]="0";
            }
                
                
        }
            if(s[i]!="0"){
                //System.out.println(s[i]+" "+ count);
                 if(count%2==0 || count%2==1){
                     count=1;
                     scount+=count;
                    
            }
                //  System.out.println(scount);
                 count=1;
            }
           
    }
        System.out.println(scount);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(s[i].equals(s[j])){
                count=count+1;
                s[j]="0";
            }
                
                
        }
            if(s[i]!="0"){
                System.out.println(s[i]);
                  count=1;
                    
                    
            }
                //  System.out.println(scount);
                
            }
           
    }
}

