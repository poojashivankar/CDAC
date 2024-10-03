/*4. Reverse a String
Problem: Write a Java program to reverse a given string.

Test Cases:

Input: "hello"
Output: "olleh"
Input: "Java"
Output: "avaJ"
Time complexity: O(n), where n is the length of the string.
Space complexity: O(n), since the StringBuilder stores the reversed string.
*/
import java.util.*;
class RevString{
    public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
char ch;
String nstr=" ";
for(int i=0;i<str.length();i++){
    ch=str.charAt(i);
nstr=ch+nstr;
}
System.out.println("Reversed word " +nstr);
// StringBuilder st=new StringBuilder();
// st.append(str);
// st.reverse();
// System.out.println(st);

    }
}