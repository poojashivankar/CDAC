//Armstrong no is sum of cube of no is same is equal to no is called armstrong no
/*
	-Program
	-Flow chart
	-Explanation
	-Output
	-Time and Space complexity
1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 153
Output: true
Input: 123
Output: false
flowchart
start
input no

Algorithm:

start
take input
count the  no
sum of no
then calculate the cube of num and sum of this no
sum is equal to no we added the no is armstrong otherwise not


another solution
start
get input
count the no
while(n>0){
r=n%10;
n=n/10;
sum= sum+r*r*r;
}
*/
import java.util.Scanner;
class ArmStrong_num{
    public static boolean armstrong(int n){
  int originalno=n;
        int sum=0;
        int digit=String.valueOf(n).length();  // find the no of digit
while(n != 0){
        int r = n % 10;   //extract the last digit
         sum += Math.pow(r,digit);
        n = n / 10;   //remove the last digit
}
return sum==originalno;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no for check enter no is ArmStrong OR Not");
        int n=sc.nextInt();
      
        if(armstrong(n)){
            System.out.println("no is ArmStrong");

        }else{
            System.out.println("No is not Armstrong");
        }
       
    }

}


/*
Explanation
get input from user
count the digit and extract it 
and extracted no get power of it
Calculating the Sum of Powers: Each digit is raised to the power of the number of digits,
 and the results are summed.
Comparison: We compare the sum of powers to the original number.
If the sum equals the original number, it’s an Armstrong number.
Otherwise, it’s not. 

time complexity:
O(d) d is the the digit no 
space complexity
O(1) we are using only fixed amount of space
*/