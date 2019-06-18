
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
public class Append_and_Delete {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int k = in.nextInt();
        
        System.out.println(appendsol(s,t,k)?"Yes":"No");
    }
    static boolean appendsol(String s,String t,int k){
        
        if(k>=s.length()+t.length()){
            return true;
    }
        for(int i=s.length();;i--){
            String prefix = s.substring(0,i);
            if(t.startsWith(prefix)){
                int diff = ((s.length()-i)+(t.length()-i));
                return diff<=k && (k-diff)%2==0;
            }
}
    }
}