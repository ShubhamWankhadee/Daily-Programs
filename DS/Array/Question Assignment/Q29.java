/*
Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/


import java.util.*;
public class Q29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		 
		System.out.println("Enter the values in Array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		 boolean flag =true;
		for(int i = 0;i<arr.length/2;i++){
			if(arr[i] != arr[arr.length-i-1]){
				 flag = false;
				 break;
			}
			 
		}
		if(flag == true){
			System.out.println("\nArray is palindrome!");
		}else{
			System.out.println("\nArray is Not palindrome!");
		}
	}
}