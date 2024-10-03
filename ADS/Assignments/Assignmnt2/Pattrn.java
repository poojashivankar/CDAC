/*1. Printing Patterns
Problem: Write a Java program to print patterns such as a right triangle of stars.

Test Cases:

Input: n = 3
Output:
*
**
***
Input: n = 5
Output:
*
**
***
****
*****
*/
import java.util.Scanner;
class Pattrn{
    public static void pattrn1(int ptr){
    for(int i = 1;i <= ptr;i++){
       for(int j = 1;j <= i;j++){
           System.out.print("*");
        }
      System.out.println(" ");
      
}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int ptr1=sc.nextInt();
        pattrn1(ptr1);

    }
}