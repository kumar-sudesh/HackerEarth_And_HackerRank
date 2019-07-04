
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
public class String_game2 {
     static final int MAX_CHAR = 256; 
  
    static void getOccuringChar(String str) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR]; 
  
        int len = str.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
                StringBuilder st = new StringBuilder();
            if (find == 1) { 
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);  
            if(count[str.charAt(i)]%2==1){
                st.append(str.charAt(i));
        } 
            else if(count[str.charAt(i)]%2==0){
                st.append(str.charAt(i));
            }
            }
            String string = st.toString();
            System.out.print(string);
            
    }
    }
    public static void main(String[] args) 
    { 
        Scanner in= new Scanner(System.in); 
        System.out.println("Enter the number of test cases: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
        String str = in.next();
        
        getOccuringChar(str); 
        }
    } 
}
