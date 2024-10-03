/*2. Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false
prime number:
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 For example 2, 3, 5, 7, 11,….. are prime numbers.*/
 import java.util.Scanner;
public class Prime_number{
    public static boolean isBoolean(int num,int div){
        if(div==1){
            return true;
        }
        if(num % div == 0){
            return false;
        }
        return isBoolean(num,div- 1);
    }
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Check given no is prive or not");
int n=sc.nextInt();
if(n <= 1){
    System.out.println(true);
}
else if(isBoolean(n,n/2))
{
System.out.println(true);
}
else{
 System.out.println(false);
 }
    
}
}

/*for(int i=2;i<=a/2;++i){
if(n%1==0){
    break;
}
return false;
        }

        */