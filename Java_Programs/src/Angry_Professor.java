
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
public class Angry_Professor {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter the number of test cases: ");
        int n = in.nextInt();
        
        for(int i=0;i<n;i++){
            int count=0;
            //System.out.println("Enter the number of students: ");
            int m=in.nextInt();
            int m_students[]=new int[m];
            //System.out.println("Enter the threshold values: ");
            int t = in.nextInt();
            
            for(int j=0;j<m_students.length;j++){
                m_students[j]=in.nextInt();
                
                if(m_students[j]<=0){
                    count++;
                }
            }
                if(count>=t){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
                
            
                    
        }
    }
}
