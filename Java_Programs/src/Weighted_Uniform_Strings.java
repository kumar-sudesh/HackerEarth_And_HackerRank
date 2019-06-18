
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
public class Weighted_Uniform_Strings {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter the string :");
        String s = in.next();
        System.out.println("Enter the weight of the alphabets: ");
        int n = in.nextInt();
        
        Set<Integer>weights = new HashSet<>();
        int currentweight =0;
        char  s1 =' ';
        
        for(char letter :s.toCharArray()){
            if(letter !=s1){
                currentweight = letter -'a'+1;
                //System.out.println(currentweight);
            }
            else{
                currentweight+=letter -'a'+1;
            }
            
            s1=letter;
            weights.add(currentweight);
        }
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            if(weights.contains(x)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
    }
}
