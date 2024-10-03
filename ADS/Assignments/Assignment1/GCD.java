/*5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1
Start 
GCD is also called as (highest common divisor)
alogorithm
start
Step 1: Check if s_num is zero.
If s_num is zero, the GCD is f_num, and return it.
If s_num is not zero, continue.
Step 2: Calculate the remainder i by finding f_num % s_num (remainder when f_num is divided by s_num).
Step 3: Assign f_num = s_num and s_num = i.
Step 4: Repeat the process until the remainder i becomes zero.
Step 5: When i becomes zero, return s_num as the greatest common divisor (GCD) of the two numbers.


Explanation
The Euclidean algorithm works by repeatedly dividing the larger number by the smaller
 and replacing the larger number with the smaller, and the smaller number with the remainder, 
 until the remainder is zero.
When the remainder is zero, the smaller number becomes the GCD.
Time Complexity:0(1)
Space Compexity:0(1)
*/
import java.util.Scanner;
class GCD{
    public static int gcd(int f_num,int s_num)
{
    int i=f_num%s_num;
    while(i !=0){
f_num=s_num;
s_num=i;
i=f_num%s_num;

    }
    return s_num;
}    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int num1=sc.nextInt();
       System.out.println("Enter Second number");
      int num2=sc.nextInt();
       System.out.println("GCD of two no is"+ gcd(num1,num2));



    }
}