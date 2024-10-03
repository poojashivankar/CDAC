/*4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]

Algorithm
start
initialize two variaable num and num2
input no from user  n
print first two no
recusive function call
Display the o/p
End
i

*/
import java.util.Scanner;
class Fabonacci{
       static int num1=0;
       static int num2=1;
        static int num3=0;
    static void fabo(int num){
       
        if(num>0){
            num3=num1+num2;
              System.out.println(" "+num3);
            num1=num2;
            num2=num3;
          fabo(num-1);
        }
      
    }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Print Fabonacci Series");
            int n=sc.nextInt();
            if(n<=0){
                 System.out.println("Enter Positive no is greater than 0");
            }else {
                  System.out.println("fab series" + num1);
                  if(n>1){
                  System.out.println(" "+num2);
                  }
                  fabo(n-2);
            }
             
               sc.close();
        }
            
            
}

