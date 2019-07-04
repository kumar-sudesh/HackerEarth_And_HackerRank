
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
public class Holiday_Season {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        String str = br.readLine().trim();
        int[][] countTill=new int[n][26];
        int[] alphaCount=new int[26];
        for(int i=0;i<n;i++){
            alphaCount[str.charAt(i)-'a']++;
            for(int j=0;j<26;j++){
                countTill[i][j]=alphaCount[j];
            }
        }
        long requiredCount=0;
        for(int i=0;i<n-3;i++){
            for(int j=i+2;j<n-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                    for(int k=i+1;k<j;k++){
                        requiredCount+=countTill[n-1][str.charAt(k)-'a']-countTill[j][str.charAt(k)-'a'];
                    }
                }
            }
        }
        System.out.print(requiredCount);
 
    }
}/* 20392989530*/
