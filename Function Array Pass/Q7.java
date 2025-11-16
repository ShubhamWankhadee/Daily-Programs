/*
Q7. Write a Java program to return the smallest number from an array using a function.

*/


import java.util.*;
public class Q7{
	static int min = Integer.MAX_VALUE;
 
	public static int Min(int arr[],int i){
			if(i <arr.length){ 
				if(min>arr[i]){
					min =  arr[i];
				} 
				Min(arr,i+1); // Recursion
			}
				
			return min;
	}
	public static void main(String args[]){
		int arr[] = {10, 15, 8, 7, 9, 12};
		  int i= 0;
		int min =Min(arr,i);
		System.out.println("Minimum no Element is :"+min);
	 
	}
}