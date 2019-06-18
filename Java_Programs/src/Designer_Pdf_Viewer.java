
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
public class Designer_Pdf_Viewer {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of integers: ");
        int n[]=new int[26];
        for(int i=0;i<26;i++){
            n[i]=in.nextInt();
        }
        String words = in.next();
        int maxheight =0;
        for(int j=0;j<words.length();j++){
            
            if(maxheight<n[words.charAt(j)-97]){
                maxheight = n[words.charAt(j)-97];
            }
        }
        System.out.println(maxheight *words.length());
        
    }
}
