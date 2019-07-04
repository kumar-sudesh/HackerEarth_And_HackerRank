
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
public class String_Operations {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        Scanner in = new Scanner(System.in);
        s.append(in.nextLine());
        int m = in.nextInt();
        for(int i=1;i<=m;i++){
            int p = in.nextInt();
            char ch = in.next().charAt(0);
            s.setCharAt(p-1,ch);
    }
        StringBuffer st = new StringBuffer(s);
        int o= in.nextInt();
        for(int i=1;i<=o;i++){
            int c = in.nextInt(),ans=0;
            int d = in.nextInt();
            StringBuffer str = new StringBuffer();
            str.append(s.substring(c-1, d));
            str.reverse();
            s.replace(c-1, d, str.toString());
        }
        int ans =0;
        System.out.println(st);
        System.out.println(s);
        
        for(int i=0;i<s.length();i++){
            if(st.charAt(i)==s.charAt(i))
                ans++;
            
           
}
         System.out.println(ans);
    }
}
