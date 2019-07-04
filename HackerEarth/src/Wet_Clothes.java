
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
public class Wet_Clothes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number of time sequence :");
        int t = in.nextInt();
        //System.out.println("Enter the number of wet clothes :");
        int w = in.nextInt();
       // System.out.println("Enter the no. of times clothes can be picked: ");
        int c = in.nextInt();
        int[]array = new int[t];
        int []arr=new int[w];
        int count=0;
        int temp =0;
        for(int i=0;i<t;i++){
            array[i]=in.nextInt();
    }
        for(int i=0;i<w;i++){
            arr[i]=in.nextInt();
}
        for(int i=0;i<t;i++){
            temp = array[i]-array[i-1];
            for(int j=0;j<w;j++){
                if(temp>=arr[j]){
                    count++;
                    arr[i]=Integer.MAX_VALUE;
        }
        
    }
}
        System.out.println(count);
    }
}
