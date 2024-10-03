/*6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.

Test Cases:

Input: "Hello World"
Output: "World Hello"
Input: "Java Programming"
Output: "Programming Java"
*/
import java.util.*;
class Reversed_word{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Original string ");
String str=sc.nextLine();
sc.close();
String[] word=str.split("\\s");
String reverstring="";
//Reverse each word's position
for(int i=0;i<word.length;i++){
    if(i==word.length-1){
        reverstring=word[i]+reverstring;

    }else{
        reverstring=" "+word[i]+reverstring;

    }

}
System.out.println(reverstring);

    }
}