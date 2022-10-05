package com.Program1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if(year<1582 && year%4 == 0){
            System.out.println("It is a Leap year."+year);
        }
        else if(year<1582){
            System.out.println("It is Not a Leap year."+year);
        }
        else if(year>=1582 && (year % 4==0 && (year % 100!=0 || year % 400==0))){
            System.out.println("It is a Leap year."+year);
        }
        else{
            System.out.println("It is Not a Leap year."+year);
        }
    }

}
