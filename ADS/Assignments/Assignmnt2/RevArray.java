/*5. Reverse Array in Place
Problem: Write a Java program to reverse an array in place.

Test Cases:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Input: arr = [7, 8, 9]
Output: [9, 8, 7]
Time Complexity: O(n), Copying elements to a new array is a linear operation.
Auxiliary Space: O(n), as we are using an extra array to store the reversed array
*/
import java.util.*;
class RevArray{
    public static void reverArray(int[] arr){
        int n = arr.length;
        //temporary store array in temp
        int[] temp=new int[n];
        //copy orignal array into temporary in reverse order
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
        //back temporary to orignal
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
    System.out.println("Enter the array " +n);
   
  
     for(int i = 0;i < n;i++){
        arr[i]=sc.nextInt();
    }
      reverArray(arr);
        for(int i = 0;i < arr.length;i++){
System.out.print(" "+arr[i]);
    }
        
    }
}