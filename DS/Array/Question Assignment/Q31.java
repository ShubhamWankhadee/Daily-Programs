/*
Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and
 store it in the new array.
*/

import java.util.*;
public class Q31{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int arr1[] = new int[size];
		System.out.println("Enter the values in Array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i =0;i<arr.length;i++){
			 arr1[i] = arr[i]* arr[i];
		}
		System.out.println("\n Square print array:");
		for(int i =0;i<arr.length;i++){
			System.out.print(" "+ arr1[i]);
		}
	}
}