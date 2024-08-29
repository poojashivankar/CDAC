public class Task22 { 
 public static void main(String[] args) { 
    displayMessage();
 }
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 



/*
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 

What syntax error occurs? Can a method be declared inside another method?
 error: illegal start of expression
 static void displayMessage() {
 ^
Task22.java:7: error: class, interface, enum, or record expected
}
^
2 errors

strat of expression is illegle
compiler expect method declaration into the class
buit nopt inside the method

<identifier> Expected: This error occurs because the compiler does not expect the static keyword or method declaration in this context.
*/

