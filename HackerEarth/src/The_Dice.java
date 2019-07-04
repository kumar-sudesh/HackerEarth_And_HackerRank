
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
public class The_Dice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[]array =s.toCharArray();
        int count=0;
        boolean flag=false;
       for(int i=0;i<array.length;i++){
          int previouscount=count;
           if(array[i]=='1' || array[i]=='2' || array[i]=='3' || array[i]=='4' || array[i]=='5'){
               count++;
       }
           else if((i==(array.length)-1) && array[i]=='6'){
               flag=true;
           }
           
        
    }
       if(flag){
        System.out.println("-1");
       }
       else{
           System.out.println(count);
       }
        
}
}
