
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
public class Count_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int n = Integer.parseInt(in.nextLine());
        
      
       for(int j=0;j<n;j++){
            int a =Integer.parseInt(in.nextLine());
           
            String s = in.nextLine();
            int count=0;
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            int m = s.charAt(i);
            if(m>=46 && m<=57){
                flag =true;
            
            
        }
            else{
                if(flag){
                    flag=false;
                    count++;
            }
    }
}
        if(flag){
            count++;
        }
            System.out.println(count);
        }
    }
}
