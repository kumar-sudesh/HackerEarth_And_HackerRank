
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
public class Manna_First_Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Strings :");
        int n =in.nextInt();
       // String s1 = "SUVO";
        //String s2 ="SUVOJIT";
        int suvo=0;
        int suvojeet=0;
        //int count=0;
        for(int i=0;i<n;i++){
            String s = in.next();
            char []arr = s.toCharArray();
            for(int j=0;j<s.length();j++){
                
               if(arr.length >= 4 && ((j+3)<arr.length)){
                if(arr[j] == 'S' && arr[j+1] == 'U' && arr[j+2] == 'V' && arr[j+3] == 'O'){
                        suvo++;
}
}
                if(arr.length >= 7 && ((j+6)<arr.length)){
            if(arr[j] == 'S'&& arr[j+1] == 'U' && arr[j+2] == 'V'&& arr[j+3] == 'O' && arr[j+4] == 'J' && arr[j+5] == 'I' &&arr[j+6] == 'T'){
                    suvojeet++;
                        suvo--;
}
}
}
          
                 System.out.println("SUVO"+" = "+suvo+", "+ "SUVOJIT"+" = "+suvojeet);
                        suvo=0;
                        suvojeet=0;
              
            
    }
    }
}


        


