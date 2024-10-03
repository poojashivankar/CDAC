/*7. Reverse a Number
Problem: Write a Java program to reverse a given number.

Test Cases:

Input: 12345
Output: 54321
Input: -9876
Output: -6789
*/
import java.util.Scanner;
class Reverse_number{
    public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int original_no=number;
  // Handle negative numbers by making the number positive temporarily
number = Math.abs(number);
int reverse=0;
while(number != 0){
int a=number % 10;   //get last element
reverse=reverse * 10 + a; //append last digit to reverse
number=number / 10;    //remove the last digit
}
if(original_no < 0){
    reverse=-reverse;
}
System.out.println("Reversed number"+reverse);


    }
}
