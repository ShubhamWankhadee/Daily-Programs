/*
Q1. Write a Java program to find the second largest number in an array using a function.
 Example Input:
 arr = {12, 45, 23, 51, 19, 8}
 Output:
 Second Largest: 45
Explanation:
Sort or traverse the array to find the largest and second largest values.


Function findSecondLargest() scans the array and updates two variables — first and second.
*/

import java.util.*;
public class Q1{
	static int max =0;
	static int max1=0;
		
	public static void Large(int arr[],int i){
	
		 // for(int i=0;i<arr.length;i++){ // loop
			if(i <arr.length){ // base case
				if(arr[i]>max){
					max1 = max;
					max= arr[i];
				}else if(arr[i]>max1 && arr[i] != max){
					max1 = arr[i];	 
				}
				
				Large(arr,i+1); // Recursion
			}else{
				
				System.out.println("Secound Max is:"+max1);
			}
		  //}
		
		
	}

	public static void main(String args[]){
		int arr[] = {12, 45, 23, 51, 19, 8};
		  int i= 0;
		Large(arr,i);
	 
	}
}