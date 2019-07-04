
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
public class Sherlock_Date {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int n = in.nextInt();
        in.nextLine();
        String day[];
        int date;
        String month;
        int year;
        for(int i=0;i<n;i++){
            day = in.nextLine().split(" ");
            date = Integer.parseInt(day[0]);
            month = day[1];
            year = Integer.parseInt(day[2]);
            
            if(date>1){
                System.out.println(date-1+" "+month+" "+year );
            }
            else{
                String temp = getmonth(month);
                if(temp=="January"|| temp=="March"||temp=="May"||temp=="July"||temp=="August"||temp=="October"||temp=="December")
                {
                    date =31;
                }
                else if(temp=="February"){
                    if(year%4==0&&year%100!=0 || year%400==0){
                        date=29;
                }
                    else{
                        date=28;
                    }
            }
                else{
                    date=30;
        }
                if(temp=="December"){
                    year=year-1;
                }
                System.out.println(date+" "+temp+" "+year);
        
        
}
        }
    }
    
    public static String getmonth(String month){
        switch(month){
            case "January":
                return "December";
            case "February":
                return "January";
            case "March":
                return "February";
            case "April":
                return "March";
            case "May":
                return "April";
            case "June":
                return "May";
            case "July":
                return "June";
            case "August":
                return "July";
            case "September":
                return "August";
            case "October":
                return "September";
            case "November":
            return "October";
            case "December":
                return "November";
        }
        return "yes";
    }
    
    
    
    
}


