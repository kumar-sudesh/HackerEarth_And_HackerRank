import java.util.*;
 
 

 
class Cost_Of_Balloons{
    public static void main(String args[] ) throws Exception {
        
       Scanner s = new Scanner(System.in);
      
 
        
 
          int c=0,c1=0,sum=0,sum1=0,min=0;
        int t=s.nextInt();
        while(t-->0){
           
            int b1=s.nextInt();
            int b2=s.nextInt();
            int n=s.nextInt();
            int arr[][]=new int[n][2];
            for(int j=0;j<n;j++){
                for(int i=0;i<2;i++){
                    arr[j][i]=s.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i][0]==1){
                    c++;
                }
            }
             
             for(int i=0;i<n;i++){
                if(arr[i][1]==1){
                    c1++;
                }
            }
           if(c>c1){
               if(b1>b2){
                   sum=c*b2;
                   sum1=c1*b1;
               }
               else{
                   sum=c*b1;
                   sum1=c1*b2;
               }
           }
           else{
               if(b1>b2){
                   sum1=c1*b2;
                   sum=c*b1;
               }
               else{
                   sum1=c1*b1;
                   sum=c*b2;
               }
           }
           
           
            
            
           
            min=sum+sum1;
            System.out.println(min);
            c=0;c1=0;sum=0;sum1=0;min=0;
        }
  
    }  
}