
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
public class Exception_Handling {
    static void solve(int arr[]) throws Exception
	{
		int ans=0;
		
		for(int i=0;i<10;i++)
			for(int j=i+1;j<10;j++)
				ans+=arr[i]/arr[j];
		
		throw new MyException(ans);
	}
	public static void main(String args[])
	{
		try
		{
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int []arr= new int[n];
			in.nextLine();
			
			for(int i=0;i<10;i++)
				arr[i]=Integer.parseInt(in.nextLine());
			
			String s=in.nextLine();
			System.out.println(s.charAt(10));
			
			solve(arr);
		}
                
                    catch(ArithmeticException e){
                        System.out.println("Invalid division");
	}
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Array index is invalid");
                    }
                catch(NumberFormatException e){
                    System.out.println("Format mismatch");
                }
                catch(StringIndexOutOfBoundsException e){
                    System.out.println("Index is invalid");
                }
                catch(MyException e){
                    
                }
                catch(Exception e){
                    System.out.println("Exception encountered");
                }
                finally{
                    System.out.println("Exception Handling Completed");
                }
}
       static  class MyException extends Exception{
                private int param;
                public  MyException(int x){
                param =x;
                    System.out.println("MyException["+param+"]");
}
}
}
