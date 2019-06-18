
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
public class Print_Hackerrank2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number of queries:");
        
        int m = in.nextInt();
        queries:
        for(int i=0;i<m;i++){
            String s1 = in.next();
          
                char[]find="hackerrank".toCharArray();
                int findindex =0;
                
                for(char c :s1.toCharArray()){
                    if(find[findindex]==c)
                        findindex++;
                    
                    if(findindex==find.length){
                        System.out.println("YES");
                        continue queries;
                    }
                }
                 System.out.println("NO");
            
           
        }
    }
}
