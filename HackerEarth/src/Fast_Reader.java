/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMARSUDESH
 */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
public class Fast_Reader {
      public static void main(String[] args) throws IOException 
    { 
  
        BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
  
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int n = Integer.parseInt(st.nextToken()); 
        long k = Long.parseLong(st.nextToken()); 
        int count = 0; 
        while (n-- > 0) 
        { 
            long x = Long.parseLong(br.readLine()); 
            if (x%k == 0) 
               count++; 
        } 
        System.out.println(count); 
    } 
}
