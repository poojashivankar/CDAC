public class Task26 { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5");
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 




/*
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5");
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 
 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block? 

error: duplicate case label
 case 5:
 ^
1 error

When the switch statement is evaluated, the program needs to know precisely which block of code to execute.
 If there are duplicate case labels
, the compiler cannot determine which one to use, leading to a logical error.
*/