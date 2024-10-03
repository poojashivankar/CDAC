/*2. Remove Array Duplicates
Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.

Test Cases:

Input: arr = [1, 1, 2]
Output: 2
Input: arr = [0, 0, 1, 1, 2, 2, 3, 3]
Output: 4
*/
import java.util.*;
class RemoveDuplicate{
    public void revDup(int[] a,int n){
        HashMap<Integer, Boolean> dup=new HashMap<>();
        for(int i=0;i<n;++i){
            if(dup.get(a[i]) == null){
                System.out.println(a[i]+ " ");
                dup.put(a[i],true);
            }
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter " + n + " Number");
for(int i=0;i< n;i++){
    
arr[i]=sc.nextInt();
}
//    for(int arr  : arr1){
//     System.out.print(arr1);
//    }
RemoveDuplicate pr=new RemoveDuplicate();
System.out.println("Uniq element are: ");
pr.revDup(arr,n);
    }
}