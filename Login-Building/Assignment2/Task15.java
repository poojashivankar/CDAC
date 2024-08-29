public class Task15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; //it having low range in byte thats why incompatible error is occur
 int result = (int)(num1 + num2); 
 System.out.println(result); 
 } 
} 



/*public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;

 Convert double value into int datatype the compile
 
*/