
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
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
public class Electronics_Shop {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         
        
        int b = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        
        Integer[] keyboards_type = new Integer[n];
        int [] pendrives_type = new int[m];
       
        for(int keyboards=0;keyboards<n;keyboards++){
            keyboards_type[keyboards]= in.nextInt();
        }
             for(int pendrives=0;pendrives<m;pendrives++){
            pendrives_type[pendrives]=in.nextInt();
            
        }
             Arrays.sort(keyboards_type,Collections.reverseOrder());
             Arrays.sort(pendrives_type);
             
             int max =-1;
             for(int i=0,j=0;i<n;i++){
                 for(;j<m;j++){
                     if(keyboards_type[i]+pendrives_type[j]>b)
                         break;
                     if(keyboards_type[i]+pendrives_type[j]>max)
                         max = keyboards_type[i]+pendrives_type[j];
        }
       
    }
             System.out.println(max);
    }
}

