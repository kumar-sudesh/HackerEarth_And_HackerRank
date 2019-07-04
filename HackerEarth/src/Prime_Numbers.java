
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
public class Prime_Numbers {
    public static void main (String[] args)
   {	
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int i =0;
       int num =0;
       
       String  primeNumbers = "";

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	    
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       
       System.out.println(primeNumbers);
   }
}
