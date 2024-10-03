/*
10. Array Left Rotation
Problem: Write a Java program to rotate an array to the left by d positions.

Test Cases:

Input: arr = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Input: arr = [10, 20, 30, 40], d = 1
Output: [20, 30, 40, 10]
*/

import java.util.Scanner;

class Array_left_rotation{
    public static void rotateArr(int arr[],int d){
int n=arr.length;
for(int i=0;i < d;i++){
int first=arr[0];
for(int j=0;j < n-1;j++){
    arr[j]=arr[j + 1];

}
arr[n-1]=first;

}
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int ntr=sc.nextInt();
int[] arr= new int[ntr];
System.out.print("Enter the element of the array: ");
for(int i=0;i<ntr;i++)
{
    arr[i]=sc.nextInt();
}
System.out.print("Enter the number of positions to rotate: ");
int d=sc.nextInt();
rotateArr(arr,d);
System.out.print("Output: ");
for(int i=0;i<ntr;i++){
   System.out.print(arr[i]+" ");
}
sc.close();

}
}