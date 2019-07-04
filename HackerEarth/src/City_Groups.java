
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
public class City_Groups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number of cities: ");
        int cities = in.nextInt();
        int citygroups = in.nextInt();
        int citynumber =0;
        int groups =0;
        int array[]=new int[cities+1];
        for(int i=0;i<citygroups;i++){
            groups = in.nextInt();
            for(int j=0;j<groups;j++){
                citynumber = in.nextInt();
                array[citynumber]=i;
                
            }
        }
        
        int testcase = in.nextInt();
        int l=0;int r=0;int diff=0;int diffone =0;
        
        for(int i=0;i<testcase;i++){
            l = in.nextInt();
            r=in.nextInt();
            diff = citygroups-Math.abs(array[l]-array[r]);
            diffone = Math.abs(array[l]-array[r]);
            System.out.println(Math.min(diff, diffone));
            
        }
        
    }
}
