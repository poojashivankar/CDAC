/*9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.

Test Cases:

Input: 121
Output: true
Input: -121
Output: false
*/

import java.util.Scanner;
class Palidrom{
    public static boolean isPalidrom(int num,int temp){
        if(num==0){
           return true;
        }
        temp = (temp * 10) + (num % 10);
        return isPalidrom(num/10,temp);

    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
       sc.close();
      if(isPalidrom(n,0)){
          System.out.println("true");
      }else{
        System.out.println("false"); 
    }
    }
}