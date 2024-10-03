/*7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

Test Cases:

Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']

First convert the given string into character array and then sort it using Arrays.sort() method.
Next, use the for loop to iterate over the element of character array.
Use if block to check whether current character is equal to the next character.
If found equal, mark the character as duplicate and repeat the process till the length of array.*/
import java.util.*;

class Repeated_char {
    public static void duplicate(String st) {
        int length = st.length();
        char[] chars = st.toCharArray();
        Arrays.sort(chars); // Sort the characters of the string

        System.out.println("Duplicate characters are: ");
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) { // Check if current and next characters are the same
                System.out.println(chars[i]); // Print the duplicate character
                
                // Skip all consecutive duplicate characters
                while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        duplicate(str); // Call the duplicate method with the input string
    }
}

