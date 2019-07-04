
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Duration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of works :");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            
            int starthour = in.nextInt();
            int startminute = in.nextInt();
            int endhour = in.nextInt();
            int endminute = in.nextInt();
           
           // System.out.println(time1);
            
            int  hourdiff = (endhour-starthour) -1;
            int abshour=Math.abs(hourdiff);
                    
            int mindiff =(60-startminute)+endminute;
            int minabs= Math.abs(mindiff);
            
            if(minabs>=60){
                abshour++;
                minabs = minabs-60;
            }
            System.out.println(abshour+" "+minabs);
          
            
    }
}
}
