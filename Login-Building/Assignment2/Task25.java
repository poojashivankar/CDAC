public class Task25 { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 


/*
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?


 error: patterns in switch statements are a preview feature and are disabled by default.
 switch(score) {
       ^
  (use --enable-preview to enable patterns in switch statements)
Task25.java:5: error: constant label of type int is not compatible with switch selector type double
 case 100:
      ^
Task25.java:8: error: constant label of type int is not compatible with switch selector type double
 case 85:
      ^
3 errors

The code does not compile due to the use of double for the switch expression. The switch statement in Java does not support floating-point types (float, double) for the switch expression. It only supports:

byte
short
int
char
String (from Java 7 onward)
Enumerated types (enums)

*/