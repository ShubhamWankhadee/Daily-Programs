/*

Q6. Write an overloaded function compare() —
Version 1: accepts a single integer array and checks if it is symmetric (first element = last element, etc.).


Version 2: accepts two integer arrays and checks whether both arrays are identical (same size and same elements in order).
Input 1: [1, 2, 3, 2, 1] → Output: Symmetric Array
Input 2: [1, 2, 3], [1, 2, 3] → Output: Arrays are identical



*/

import java.util.*;
class MaxFinder{
	public void compare(int arr[]){
		boolean flag = true;
		for(int i=0;i<arr.length/2;i++){
			if(arr[i] != arr[arr.length-1-i]){
				flag = false;
				System.out.println("Array is not Symmetric");
				break;
			}
		}
		if(flag){
			System.out.println("Array is Symmetric");
		}
	 
	}
	public void compare(int arr1[],int arr2[]){
		boolean flag = true;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i]){
				flag = false;
					System.out.println("Array is not Identical");
				break;
			}
		}
		if(flag){
			System.out.println("Array is Identical");
		}
	}
	 
	
	
	
}
public class Q6{

	public static void main(String args[]){
		MaxFinder obj = new MaxFinder();
		int arr[] = {1, 2, 3, 2, 1};
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
			obj.compare(arr);
			obj.compare(arr1 ,arr2);
		 
		  
	}
}
