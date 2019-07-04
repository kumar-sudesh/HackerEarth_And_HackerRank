
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
public class Golden_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = in.nextInt();
        int count=0;
        //double a = 1.6;
        
        for(int i=0;i<n;i++){
            int firstnumber = in.nextInt();
            int secondnumber = in.nextInt();
            //double  max = Math.max(firstnumber,secondnumber);
            //double sum = (firstnumber+secondnumber)/max;
            double temp = (double)firstnumber/secondnumber;
            double temp2 =(double)secondnumber/firstnumber;
            if(temp>=1.6 && temp<=1.7){
                count=count+1;
            }
            if(temp2>=1.6 && temp2<=1.7){
                count=count+1;
        }
       
        
        
        
        
    }
         System.out.println(count);
}
}
