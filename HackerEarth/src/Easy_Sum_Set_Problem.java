
import java.util.Arrays;
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
public class Easy_Sum_Set_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the elements of set A: ");
        int a = in.nextInt();
        int[]array= new int[a];
        for(int i=0;i<a;i++){
            array[i]=in.nextInt();
    }
        Arrays.sort(array);
        //System.out.println("Enter the elements of set B:");
        int b=in.nextInt();
        int[]arrayb= new int[b];
        for(int i=0;i<b;i++){
            arrayb[i]=in.nextInt();
        }
        Arrays.sort(arrayb);
        int flag=0;
        int max = arrayb[b-1];
        int sum =0;
        x:for(int i=1;i<100;i++){
          
            y: for(int j=0;j<a;j++){
                  flag=0;
                sum=array[j]+i;
                
                if(sum>max)
                    break x;
                for(int k=0;k<b;k++){
                    if(sum==arrayb[k]){
                        flag=1;
                        break;
                    }
                }
                  if(flag==0){
                     break y;
            }
            }
                  if(flag==1){
                      System.out.print(i+" ");
            }
          
            
                        
        }
        
}
    }

