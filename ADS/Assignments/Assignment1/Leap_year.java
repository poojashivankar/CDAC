/*
10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.

Test Cases:

Input: 2020
Output: true
Input: 1900
Output: false
*/
import java.util.Scanner;
class Leap_year{
    public static boolean isLeap(int year){
        if((year%4==0 && year%100!= 0) || year%400 ==0){
            return true;

        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the year");
int yr=sc.nextInt();
if(isLeap(yr)){
    System.out.println("true");
}else{
    System.out.println("false");
}
    }
}