/*6. Find Square Root
Problem: Write a Java program to find the square root of a given number (using integer approximation).

Test Cases:

Input: x = 16
Output: 4
Input: x = 27
Output: 5

*/
import java.util.Scanner;
class Squartrt{
    public static void main(String[] args){
     
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no");
        int num=sc.nextInt();
          double dt=Math.sqrt(num);
       System.out.println(dt);


    }
}
