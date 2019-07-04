
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
public class Hacker_With_Bits {
   public static void main(String args[] ) throws Exception {
Scanner fr = new Scanner(System.in);
int n = fr.nextInt();
int i, max = 0, count = 0, j1 = -1 , j2 = -1, zero = 0;
boolean b = false;
int []a = new int[n];
for(i = 0; i < n; i++){
a[i] = fr.nextInt();
}
for(i = 0; i < n; i++){
if(a[i] == 1){
count ++;
}
else{
zero++;
j1 = j2;
j2 = i;
if(i > 0 && i + 1 < n && a[i+1] == 1 && a[i-1] == 1){
count = i - j1;
b = true;
}
else{
count = 0;
}
}
if(count > max){
max = count;
}
// System.out.println(a[i]+" "+j1+" "+j2+" "+count+" "+i);
}
if(zero == 1){
//System.out.println("one");
System.out.println(n - 1);
}
else if(zero == n){
//if given array has all zero
//System.out.println("two");
System.out.println(0);
}
else if(j2 + 1 == zero){
// if all the zero occur first then all 1
//e.g. 0001111
//System.out.println("three");
System.out.println(max);
}
else if(!b){
//if there is no position having 1 0 1
//System.out.println("four");
System.out.println(max + 1);
}
else{
System.out.println(max);
}
fr.close();
}
}
