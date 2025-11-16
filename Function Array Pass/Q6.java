/*
Q6. Write a Java program to 
find and return the maximum element from an integer array.Use a function that returns the maximum value.

*/


import java.util.*;
public class Q6{
	static int max = 0;
 
	public static int Max(int arr[],int i){
			if(i <arr.length){ 
				if(max<arr[i]){
					max =  arr[i];
				} 
				Max(arr,i+1); // Recursion
			}
				
			return max;
	}
	public static void main(String args[]){
		int arr[] = {10, 15, 8, 7, 9, 12};
		  int i= 0;
		int max =Max(arr,i);
		System.out.println("Maxmum no Element is :"+max);
	 
	}
}