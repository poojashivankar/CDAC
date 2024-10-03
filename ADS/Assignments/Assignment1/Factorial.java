/*
3. Factorial
Problem: Write a Java program to compute the factorial of a given number.

Test Cases:

Input: 5
Output: 120
Input: 0
Output: 1

*/
import java.util.Scanner;
class Factorial{
    static int fact(int n){
if(n<=1){
    return 1;
}else{
    return n*fact(n-1);
}
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
         System.out.println(fact(num));

    }
}

